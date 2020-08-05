package com.zyf.ice.spring.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author zyting
 * @sinne 2020-08-05
 * spring 启动服务类
 */
@Service
public class IceService implements Runnable{

    /**服务名*/
    private static final String SERVER_NAME="Hello";
    /**服务端点*/
    private static final String SERVER_ENDPOINT="tcp -p 10016";

    @Autowired
    private HelloServant helloServant;

    @PostConstruct
    private void startIceServer(){
        // 构造线程池启动当前任务
        LinkedBlockingQueue<Runnable> runnableList = new LinkedBlockingQueue<>();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(100,100,1L, TimeUnit.SECONDS,runnableList);
        threadPoolExecutor.execute(this);
    }

    @Override
    public void run() {
        //ice通信器
        Ice.Communicator communicator = null;
        try {
            //初始化ice通信器communicator,可以使用args传入一下ice初始化的参数如超时时间，线程池大小等
            communicator = Ice.Util.initialize();

            //创建一个名为queryEmployeeAdapter的适配器并且默认使用tcp协议

            Ice.ObjectAdapter adapter = communicator.createObjectAdapterWithEndpoints(SERVER_NAME,SERVER_ENDPOINT);

            // 将servant与ice对象标识符建立映射关系，并添加到ice对象适配器中
            adapter.add(helloServant, Ice.Util.stringToIdentity(SERVER_NAME));

            // 激活对象适配器
            adapter.activate();

            System.out.println("服务启动");
            // 服务在退出之前一直保持监听状态
            communicator.waitForShutdown();

        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            //异常销毁通信器
            if(communicator != null){
                communicator.destroy();
            }
        }
    }

}
