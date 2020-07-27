package com.test.ice.service.client;

import Ice.Communicator;
import Ice.ObjectPrx;
import Ice.Util;
import com.test.ice.service.generated.HelloPrx;
import com.test.ice.service.generated.HelloPrxHelper;

import java.util.logging.Logger;

/**
 * @author zyting
 * @sinne 2020-07-27
 * 客户端模板代码
 */
public class Client {

    private static Logger log = Logger.getLogger(Client.class.getSimpleName());

    public static void main(String[] args) {

        int status = 0;
        // Communicator 实例
        Communicator ic = null;
        try {
            log.info("客户端启动。。。。");

            // 调用Ice.Util.Initialize() 初始化 Ice run time
            ic = Util.initialize(args);

            // 根据servant的名称以及服务器ip、端口获取远程服务代理
            // 传入远程服务单元的名称、网络协议、IP及端口，构建一个Proxy对象
            ObjectPrx base = ic.stringToProxy("SimplePrinter:default -p 9996");

            // 将上面的代理向下转换成一个Printer接口的代理
            HelloPrx hello = HelloPrxHelper.checkedCast(base);

            // 如果转换成功
            if(hello == null){
                throw new Error("Invalid proxy");
            }

            // 调用这个代理，将字符串传给它
            String s = hello.sayHello(" World!");
            System.out.println("调用代理返回结果："+s);

        }catch (Ice.LocalException e){
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
