package com.ccc.server;

import Ice.Object;
import Ice.ObjectAdapter;
import Ice.Util;
import com.ccc.service.IDataUpdatorImpl;

/**
 * @author zyting
 * @sinne 2020-07-30
 */
public class DataUpdatorServer extends Ice.Application{

    public static void main(String[] args) {
        System.out.println("服务器启动。。。。。");
        // 实例化服务
        DataUpdatorServer app = new DataUpdatorServer();
        // 启动服务（这里执行了run方法）
        int status = app.main("DataUpdatorServer", args);
        System.exit(status);
    }

    @Override
    public int run(String[] strings) {
        ObjectAdapter adapter =
                communicator().createObjectAdapterWithEndpoints("dataAdapter", "default -p 7777");

        Object servant = new IDataUpdatorImpl();

        adapter.add(servant, Util.stringToIdentity("dataUpdator"));

        adapter.activate();

        communicator().waitForShutdown();

        return 0;
    }


}
