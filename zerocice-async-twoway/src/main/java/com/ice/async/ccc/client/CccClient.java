package com.ice.async.ccc.client;

import Ice.LocalException;
import Ice.ObjectPrx;
import Ice.Util;
import com.ice.async.ccc.callback.CccInterpolate;
import com.ice.async.ccc.generated.AsyncCccPrx;
import com.ice.async.ccc.generated.AsyncCccPrxHelper;

/**
 * @author zyting
 * @sinne 2020-07-28
 * C++ 客户端代码，每次有数据变化时都调用此方法
 */
public class CccClient {

    public static void main(String[] args) {
        int status = 0;
        // 定义通信器
        Ice.Communicator ic = null;
        try {
            // 实例化通信器
            ic = Util.initialize(args);

            // 获取java的代理对象
            ObjectPrx base = ic.stringToProxy("testJava:default -p 9999");
            if(base == null){
                throw new RuntimeException("Cannot create proxy");
            }

            AsyncCccPrx cccProxy = AsyncCccPrxHelper.checkedCast(base);
            if(cccProxy == null){
                throw new RuntimeException("Invalid proxy");
            }

            CccInterpolate cccBack = new CccInterpolate();

            cccProxy.begin_getAsyncCccStr("站点变化数据集合List", cccBack);

            System.out.println("C++客户端启动。。。。");

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
