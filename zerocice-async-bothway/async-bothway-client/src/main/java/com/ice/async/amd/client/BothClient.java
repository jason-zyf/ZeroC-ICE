package com.ice.async.amd.client;

import Ice.LocalException;
import Ice.ObjectPrx;
import Ice.Util;
import com.ice.async.amd.callback.AgeInterpolate;
import com.ice.async.amd.callback.NameInterpolate;
import com.ice.async.amd.generated.AsyncAmdPrx;
import com.ice.async.amd.generated.AsyncAmdPrxHelper;

import java.util.logging.Logger;

/**
 * @author zyting
 * @sinne 2020-07-29
 */
public class BothClient {

    private static Logger log = Logger.getLogger(BothClient.class.getSimpleName());

    public static void main(String[] args) {
        int status = 0;
        // 定义通信器
        Ice.Communicator ic = null;
        try {
            // 实例化通信器
            ic = Util.initialize(args);

            ObjectPrx base = ic.stringToProxy("AsyncBoth:tcp -h 127.0.0.1 -p 8877");
            if(base == null){
                throw new RuntimeException("Cannot create proxy");
            }

            AsyncAmdPrx amdProxy = AsyncAmdPrxHelper.checkedCast(base);
            if(amdProxy == null){
                throw new RuntimeException("Invalid proxy");
            }

            AgeInterpolate ageBack = new AgeInterpolate();
            amdProxy.begin_getAge(17, ageBack);

            NameInterpolate nameBack = new NameInterpolate();
            amdProxy.begin_getName("qwe", nameBack);

            log.info("调用两个方法客户端启动。。。。。。。。");
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
