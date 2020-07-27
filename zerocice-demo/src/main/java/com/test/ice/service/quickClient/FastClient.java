package com.test.ice.service.quickClient;

import Ice.Communicator;
import Ice.ObjectPrx;
import Ice.Util;
import com.test.ice.service.generated.HelloPrx;
import com.test.ice.service.generated.HelloPrxHelper;

import java.util.logging.Logger;

/**
 * @author zyting
 * @sinne 2020-07-27
 */
public class FastClient {

    private static Logger log = Logger.getLogger(FastClient.class.getSimpleName());

    public static void main(String[] args) {
        log.info("客户端启动.....");
        // 通信器
        Communicator ic = null;
        // 初始化此通信器
        ic = Util.initialize(args);
        // 根据地址生成一个服务代理对象
        // HelloIce -- 服务端那边自己定义的名字
        ObjectPrx proxy = ic.stringToProxy("HelloIce:default -p 1888");
        // 转换成HelloService类型的代理服务
        HelloPrx hello = HelloPrxHelper.checkedCast(proxy);
        //调用方法
        String s = hello.sayHello(" World!");
        System.out.println(">>"+ s);
    }
}
