package com.ice.async.amd.client;

import Ice.LocalException;
import Ice.ObjectPrx;
import Ice.Util;
import com.ice.async.amd.callback.AsyncAmd_interpolate;
import com.ice.async.amd.generated.AsyncAmdPrx;
import com.ice.async.amd.generated.AsyncAmdPrxHelper;


/**
 * @author zyting
 * @sinne 2020-07-28
 * 客户端代码
 */
public class AmdClient {

    public static void main(String[] args) {
        int status = 0;
        // 定义通信器
        Ice.Communicator ic = null;
        try {
            // 实例化通信器
            ic = Util.initialize(args);

            ObjectPrx base = ic.stringToProxy("testAmd:default -p 9999");
            if(base == null){
                throw new RuntimeException("Cannot create proxy");
            }

            AsyncAmdPrx amdProxy = AsyncAmdPrxHelper.checkedCast(base);
            if(amdProxy == null){
                throw new RuntimeException("Invalid proxy");
            }

            AsyncAmd_interpolate amdBack = new AsyncAmd_interpolate();

            amdProxy.begin_getAsyncAmdStr("sd", amdBack);

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
