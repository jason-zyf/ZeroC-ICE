package com.ccc.test;

import Ice.*;
import com.ccc.service.IDataUpdatorImpl;
import hjmos.EntitiesDataService.*;
import org.junit.Test;

import java.lang.Exception;
import java.lang.Object;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 * @author zyting
 * @sinne 2020-07-31
 */
public class TestClient {

    public final static Logger log = Logger.getLogger(TestClient.class.getSimpleName());

    @Test
    public void test(){
        System.out.println("afdafa");
    }

    /**
     * 测试与c++的通信
     */
    @Test
    public void testInvokingC(){
        int status = 0;
        // 定义通信器
        Ice.Communicator ic = null;
        try {
            // 实例化通信器
            ic = Util.initialize();

            // 1、初始化本地接口作为服务端
            initLocalServer(ic);

            // 2、获取本地服务代理对象   tcp -h 172.23.127.60 -p 7755
            IDataUpdatorPrx iDataUpdatorPrx = findLocalPrx(ic);

            // 3、获取远程客户端的代理对象
            IDataServiceAccessorPrx accessorPrx = findRemoteClientPrx(ic);

            // 4、注册到服务端，返回的字符串用来辨识是哪个客户端
            String register = accessorPrx.Register(iDataUpdatorPrx);

            //5、调用远程服务方法
            invoking(accessorPrx,register);

            log.info("客户端启动。。。。。。");

            // 接受15秒后再取消订阅
            TimeUnit.SECONDS.sleep(15);

            // 6、取消订阅
//            boolean b = accessorPrx.UnSubscribe(register);
//            log.info("是否取消订阅成功："+b);

        }catch (LocalException e){
            e.printStackTrace();
            status = 1;
        }catch (Exception e){
            e.printStackTrace();
            status = 1;
        }finally {
//            if(ic != null){
//                ic.destroy();
//            }
        }
//        System.exit(status);
    }

    /**
     * 初始化本地服务对象
     * @param ic
     */
    private void initLocalServer(Communicator ic) {
        // 创建一个名为SimplePrinterAdapter的对象适配器(ObjectAdapter)，传入适配器名字和在9996端口处接受来的请求，使用缺省通信协议（TCP/IP 端口为9996的请求）
        ObjectAdapter adapter = ic.createObjectAdapterWithEndpoints("dataUpdatorAdapter", "default -p 7755");
        // 实例化一个PrinterI 对象（servant），为Printer 接口创建一个servant
        Object servant = new IDataUpdatorImpl();
        // 调用适配器的add，告诉它有一个新的servant，传递的参数是servant，这里的“SimplePrinter”是servant的名字
        // 将servant关联到ID为 SimplePrinter 的Ice Object;
        adapter.add((Ice.Object) servant, Util.stringToIdentity("dataUpdatorService"));
        // 调用适配器的active()方法，激活适配器，激活后服务器开始处理来自客户的请求。
        adapter.activate();
        // 让服务在退出之前，一直持续对请求的监听
        // ic.waitForShutdown();
    }

    /**
     * 获取本地代理对象
     * @param ic
     * @return
     */
    private IDataUpdatorPrx findLocalPrx(Communicator ic) {
        ObjectPrx localBase = ic.stringToProxy("dataUpdatorService:default -p 7755");
        // 这样会报错，因为不是自己的endpoint
        IDataUpdatorPrx iDataUpdatorPrx = IDataUpdatorPrxHelper.checkedCast(localBase);
        if(iDataUpdatorPrx == null){
            throw new RuntimeException("Invalid local proxy");
        }
        return iDataUpdatorPrx;
    }

    /**
     * 获取远程服务代理对象
     * @param ic
     * @return
     */
    private IDataServiceAccessorPrx findRemoteClientPrx(Communicator ic) {
        ObjectPrx base = ic.stringToProxy("EntitiesDataService:tcp -h 10.50.11.201 -p 8999");
        if(base == null){
            throw new RuntimeException("Cannot create proxy");
        }

        IDataServiceAccessorPrx accessorPrx = IDataServiceAccessorPrxHelper.checkedCast(base);
        if(accessorPrx == null){
            throw new RuntimeException("Invalid proxy");
        }
        return accessorPrx;
    }

    /**
     * 调用远程方法
     * @param accessorPrx
     * @param register
     */
    private void invoking(IDataServiceAccessorPrx accessorPrx, String register) {
        // 服务端接口标识
        String interfaced = "aaaa";
        // 想要获取的车站信息
        LocatitionInfo info = new LocatitionInfo(22,2201,"0");
        // 接口的点位
        String[] entitiesArray = new String[]{"点位名称1","点位名称2","点位名称3","点位名称4","点位名称5","点位名称6","点位名称7","点位名称8"};

        // 调用远程服务方法
        accessorPrx.QueryEntitiesValue(register, interfaced, info, entitiesArray);
    }


}
