package com.test.ice.service.client;

import Ice.Communicator;
import Ice.ObjectAdapter;
import Ice.Util;
import com.test.ice.service.Impl.HelloI;

import java.util.logging.Logger;

/**
 * @author zyting
 * @sinne 2020-07-27
 */
public class Server {

    private static Logger log = Logger.getLogger(Server.class.getSimpleName());

    public static void main(String[] args) {
        int status = 0;
        // Communicator 实例，是ice run time的主句柄
        Communicator ic = null;
        try {
            log.info("server服务容器启动成功。。。");

            // 调用Ice.Util.Initialize() 初始化 Ice run time, args初始化参数可传可不传；
            // 如连接超时，初始化客户端连接池的数量等
            ic = Util.initialize(args);

            // 创建一个名为SimplePrinterAdapter的对象适配器(ObjectAdapter)，传入适配器名字和在9996端口处接受来的请求，使用缺省通信协议（TCP/IP 端口为9996的请求）
            ObjectAdapter adapter = ic.createObjectAdapterWithEndpoints("SimplePrinterAdapter", "default -p 9996");

            // 实例化一个PrinterI 对象（servant），为Printer 接口创建一个servant
            Object servant = new HelloI();

            // 调用适配器的add，告诉它有一个新的servant，传递的参数是servant，这里的“SimplePrinter”是servant的名字
            // 将servant关联到ID为 SimplePrinter 的Ice Object;
            adapter.add((Ice.Object) servant, Util.stringToIdentity("SimplePrinter"));

            // 调用适配器的active()方法，激活适配器，激活后服务器开始处理来自客户的请求。
            adapter.activate();

            // 让服务在退出之前，一直持续对请求的监听
            ic.waitForShutdown();

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
