package com.ice.async.java.client;

import Ice.LocalException;
import Ice.ObjectPrx;
import Ice.Util;
import com.ice.async.ccc.callback.CccInterpolate;
import com.ice.async.ccc.generated.AsyncCccPrx;
import com.ice.async.ccc.generated.AsyncCccPrxHelper;
import com.ice.async.java.callback.JavaInterpolate;
import com.ice.async.java.generated.AsyncJavaPrx;
import com.ice.async.java.generated.AsyncJavaPrxHelper;

/**
 * @author zyting
 * @sinne 2020-07-28
 * java 客户端代理，请求c++的服务
 */
public class JavaClient {

    public static void main(String[] args) {
        int status = 0;
        // 定义通信器
        Ice.Communicator ic = null;
        try {
            // 实例化通信器
            ic = Util.initialize(args);

            // 获取java的代理对象
            ObjectPrx base = ic.stringToProxy("ccc:default -p 6666");
            if(base == null){
                throw new RuntimeException("Cannot create proxy");
            }

            // 获取一个Ccc代理对象
            AsyncJavaPrx javaProxy = AsyncJavaPrxHelper.checkedCast(base);
            if(javaProxy == null){
                throw new RuntimeException("Invalid proxy");
            }

            JavaInterpolate cccBack = new JavaInterpolate();

            javaProxy.begin_getAsyncJavaStr("站点变化数据集合List", cccBack);

            System.out.println("java客户端启动。。。。");

        }catch (LocalException e){
            e.printStackTrace();
            status = 1;
        }catch (Exception e){
            e.printStackTrace();
            status = 1;
        }finally {
            if(ic != null){
                ic.destroy();
            }
        }
        System.exit(status);
    }

}
