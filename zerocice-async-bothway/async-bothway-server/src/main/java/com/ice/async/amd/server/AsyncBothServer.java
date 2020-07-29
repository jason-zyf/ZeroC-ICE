package com.ice.async.amd.server;

import Ice.Object;
import Ice.ObjectAdapter;
import Ice.Util;
import com.ice.async.amd.service.impl.AmdImpl;

import java.util.logging.Logger;

/**
 * @author zyting
 * @sinne 2020-07-29
 * 服务端
 */
public class AsyncBothServer extends Ice.Application{

    private static Logger log = Logger.getLogger(AsyncBothServer.class.getSimpleName());

    public static void main(String[] args) {
        log.info("服务器启动。。。。。");
        // 实例化服务
        AsyncBothServer app = new AsyncBothServer();
        // 启动服务（这里执行了run方法）
        int status = app.main("AsyncBothServer", args);
        System.exit(status);
    }

    @Override
    public int run(String[] strings) {
        ObjectAdapter adapter =
                communicator().createObjectAdapterWithEndpoints("AsyncBothAdapter", "default -p 8877");

        Object servant = new AmdImpl();

        adapter.add(servant, Util.stringToIdentity("AsyncBoth"));

        adapter.activate();

        communicator().waitForShutdown();

        return 0;
    }

}
