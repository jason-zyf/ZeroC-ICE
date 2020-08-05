package com.zyf.ice.java.server;

import Ice.Communicator;
import Ice.ObjectAdapter;
import Ice.Util;

/**
 * @author zyting
 * @sinne 2020-08-05
 * 服务类
 */
public class IceService {

    /**服务名*/
    private static final String SERVER_NAME="Hello";
    /**服务名*/
    private static final String SERVER_ENDPOINT="tcp -p 10006";

    public static void main(String[] args) {
        //获取实现类 SpringContextUtil.getBean(helloServant)
        HelloServant helloServant = new HelloServant();

        // ice 通信器
        Communicator ic = null;
        try {
            //初始化ice通信器communicator,可以使用args传入一下ice初始化的参数如超时时间，线程池大小等
            ic = Util.initialize(args);

            ObjectAdapter adapter = ic.createObjectAdapterWithEndpoints(SERVER_NAME, SERVER_ENDPOINT);
            adapter.add(helloServant, Util.stringToIdentity(SERVER_NAME));

            adapter.activate();

            System.out.println("服务器启动。。");

            ic.waitForShutdown();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(ic != null){
                ic.destroy();
            }
        }

    }

}
