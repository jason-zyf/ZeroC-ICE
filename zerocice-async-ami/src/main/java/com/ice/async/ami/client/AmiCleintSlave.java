package com.ice.async.ami.client;

import Ice.Communicator;
import Ice.LocalException;
import Ice.ObjectPrx;
import Ice.Util;
import com.ice.async.ami.callback.AsyncAmi_interpolate;
import com.ice.async.ami.generated.AsyncAmiPrx;
import com.ice.async.ami.generated.AsyncAmiPrxHelper;

/**
 * @author zyting
 * @sinne 2020-07-28
 * 创建另一个client同时请求，只有当第一个请求完成后，才会接受另一个客户端的请求，相当于一个队列
 */
public class AmiCleintSlave {

    public static void main(String[] args) {
        int status = 0;
        // 定义通信器
        Communicator ic = null;
        try {
            // 实例化通信器
            ic = Util.initialize(args);
            // 实例化通信代理
            ObjectPrx base = ic.stringToProxy("testAmi:default -p 8778");
            if(base == null){
                throw new RuntimeException("Cannot create proxy");
            }

            // 获取代理
            AsyncAmiPrx amiProxy = AsyncAmiPrxHelper.checkedCast(base);
            if(amiProxy == null){
                throw new RuntimeException("Invalid proxy");
            }

            // 同步方式
//            String sync = amiProxy.getAsyncStr("sync");
//            System.out.println(sync);

            // 定义回调方式
            AsyncAmi_interpolate back1 = new AsyncAmi_interpolate();
            // 注入回调方式，异步请求数据
            amiProxy.begin_getAsyncStr("World!", back1);

            System.out.println("客户端启动。。。。");
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
