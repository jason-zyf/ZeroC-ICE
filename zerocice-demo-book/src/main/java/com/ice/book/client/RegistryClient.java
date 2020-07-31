package com.ice.book.client;

import Ice.Communicator;
import Ice.Exception;
import Ice.ObjectPrx;
import Ice.Util;
import com.ice.book.slice2java.book.Message;
import com.ice.book.slice2java.book.OnlineBookPrx;
import com.ice.book.slice2java.book.OnlineBookPrxHelper;

import java.util.logging.Logger;

/**
 * @author zyting
 * @sinne 2020-07-31
 * 采用ice registry注册中心的方式启动客户端
 */
public class RegistryClient {

    public static final Logger log = Logger.getLogger(MyClient.class.getSimpleName());

    public static void main(String[] args) {

        // 采用Registry以后，需要初始化参数
        String[] initParams = new String[]{"--Ice.Default.Locator=IceGrid/Locator:tcp -h localhost -p 4061"};

        // 调用购买书籍方法
        bookTick(initParams);

    }

    private static void bookTick(String[] initParams) {
        int status = 0;
        Communicator ic = null;
        Message message = null;
        try {
            log.info("书籍订阅客户端启动。。。。。。。");
            ic = Util.initialize(initParams);

            ObjectPrx base = ic.stringToProxy("OnlineBook@OnlineBookAdapter");

            OnlineBookPrx onliceBook = OnlineBookPrxHelper.checkedCast(base);

            if (onliceBook == null) {
                throw new RuntimeException("Invalid proxy");
            }
            //调用服务方法
            Message msg = new Message();
            msg.name = "mysql从入门到删库跑路。。。";
            msg.type = 2;
            msg.price = 66.66;
            msg.valid = true;
            msg.content = "是时候表演真正的技术了。。。。。";

            message = onliceBook.bookTick(msg);
            log.info("返回数据信息：书名：" + message.name + "说明：" + message.content);
        } catch (Exception e) {
            e.getStackTrace();
            status = 1;
        } finally {
            if (ic != null) {
                ic.destroy();
            }
            // 如果后面还有程序需要运行，这行代码需要注释
//            System.exit(status);
        }
    }

}

