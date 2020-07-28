package com.test.ice.async.client;

import Ice.Object;
import Ice.ObjectAdapter;
import Ice.Util;
import com.test.ice.async.service.impl.TestAsyncAmiImpl;

/**
 * @author zyting
 * @sinne 2020-07-28
 * 服务端代码
 */
public class AmiServer extends Ice.Application{

    public static void main(String[] args) {
        System.out.println("服务端启动。。。。");
        // 实例化服务
        AmiServer app = new AmiServer();
        //启动服务（这里执行了run方法）
        int status = app.main("AmiServer", args);

        System.exit(status);
    }

    @Override
    public int run(String[] strings) {
        // 创建一个对象适配器
        ObjectAdapter adapter =
                communicator().createObjectAdapterWithEndpoints("AsyncAmi", "default -p 8778");

        // 创建一个servant 实例
        Object servant = new TestAsyncAmiImpl();

        // 添加到适配器里面
        adapter.add(servant, Util.stringToIdentity("testAmi"));

        // 激活适配器
        adapter.activate();

        communicator().waitForShutdown();

        return 0;
    }
}
