package com.ice.async.amd.client;

import Ice.Object;
import Ice.ObjectAdapter;
import Ice.Util;
import com.ice.async.amd.service.impl.AsyncAmdImpl;

/**
 * @author zyting
 * @sinne 2020-07-28
 */
public class AmdServer extends Ice.Application{

    public static void main(String[] args) {
        System.out.println("服务器启动。。。。。");
        // 实例化服务
        AmdServer app = new AmdServer();
        // 启动服务（这里执行了run方法）
        int status = app.main("AmdServer", args);
        System.exit(status);
    }

    @Override
    public int run(String[] strings) {
        ObjectAdapter adapter =
                communicator().createObjectAdapterWithEndpoints("AsyncAmd", "default -p 9999");

        Object servant = new AsyncAmdImpl();

        adapter.add(servant, Util.stringToIdentity("testAmd"));

        adapter.activate();

        communicator().waitForShutdown();

        return 0;
    }
}
