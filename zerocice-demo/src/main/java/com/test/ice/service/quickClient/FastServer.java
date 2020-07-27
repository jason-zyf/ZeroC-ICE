package com.test.ice.service.quickClient;

import Ice.Communicator;
import Ice.Identity;
import Ice.ObjectAdapter;
import Ice.Util;
import com.test.ice.service.Impl.HelloI;

import java.util.logging.Logger;

/**
 * @author zyting
 * @sinne 2020-07-27
 */
public class FastServer {

    private static Logger log = Logger.getLogger(FastServer.class.getSimpleName());

    public static void main(String[] args) {
        // 通信器
        Communicator ic = null;
        // 初始化这个通信器
        ic = Util.initialize(args);
        // 创建ice适配器，将服务调用地址和服务映射起来
        // "HelloServiceAdapter"是适配器名, "default -p 1888"是服务调用的地址
        ObjectAdapter adapter = ic.createObjectAdapterWithEndpoints("HelloServiceAdapter", "default -p 1888");
        // 将服务的具体实现类servant交给这个适配器
        Object servant = new HelloI();
        // "HelloIce"--服务接口在ice中注册名,转成唯一标识identity
        Identity id = Util.stringToIdentity("HelloIce");
        adapter.add((Ice.Object) servant, id);
        // 激活这个适配器
        adapter.activate();

        log.info("server服务容器启动成功。。。");
    }

}
