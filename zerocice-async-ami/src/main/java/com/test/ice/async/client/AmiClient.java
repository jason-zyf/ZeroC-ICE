package com.test.ice.async.client;

import Ice.*;
import com.test.ice.async.callback.AsyncAmi_interpolateI;
import com.test.ice.async.generated.TestAsyncAmiPrx;
import com.test.ice.async.generated.TestAsyncAmiPrxHelper;

import java.lang.Exception;

/**
 * @author zyting
 * @sinne 2020-07-28
 * 客户端代码
 */
public class AmiClient {

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
            TestAsyncAmiPrx amiProxy = TestAsyncAmiPrxHelper.checkedCast(base);
            if(amiProxy == null){
                throw new RuntimeException("Invalid proxy");
            }

            // 同步方式
//            String sync = amiProxy.getAsyncStr("sync");
//            System.out.println(sync);

            // 定义回调方式
            AsyncAmi_interpolateI back = new AsyncAmi_interpolateI();
            // 注入回调方式，异步请求数据
            amiProxy.begin_getAsyncStr("World!", back);

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
