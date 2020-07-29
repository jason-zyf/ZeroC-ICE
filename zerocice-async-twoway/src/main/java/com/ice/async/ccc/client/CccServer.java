package com.ice.async.ccc.client;

import Ice.Object;
import Ice.ObjectAdapter;
import Ice.Util;
import com.ice.async.ccc.service.impl.CccImpl;

/**
 * @author zyting
 * @sinne 2020-07-28
 * C++ 服务端，用于监听java客户端的请求
 */
public class CccServer extends Ice.Application{

    public static void main(String[] args) {
        System.out.println("C++服务器启动，用于监听java端第一次请求。。。。。");
        // 实例化服务
        CccServer app = new CccServer();
        // 启动服务（这里执行了run方法）
        int status = app.main("CccServer", args);
        System.exit(status);
    }

    @Override
    public int run(String[] strings) {
        ObjectAdapter adapter =
                communicator().createObjectAdapterWithEndpoints("adapterCcc", "default -p 6666");

        Object servant = new CccImpl();

        adapter.add(servant, Util.stringToIdentity("ccc"));

        adapter.activate();

        communicator().waitForShutdown();

        return 0;
    }

}
