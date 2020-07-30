package com.ice.book.client;

import Ice.Communicator;
import Ice.Exception;
import Ice.ObjectPrx;
import Ice.Util;
import com.ice.book.slice2java.book.Message;
import com.ice.book.slice2java.book.OnlineBookPrx;
import com.ice.book.slice2java.book.OnlineBookPrxHelper;
import com.ice.book.slice2java.message.SMSServicePrx;
import com.ice.book.slice2java.message.SMSServicePrxHelper;

import java.util.logging.Logger;

/**
 * @author zyting
 * @sinne 2020-07-29
 */
public class MyClient {

    public static final Logger log = Logger.getLogger(MyClient.class.getSimpleName());

    public static void main(String[] args) {

        // 调用购买书籍方法
        bookTick(args);

        // 调用发送消息接口
        sendSMs(args);

        // 从 SMSService 服务中调用 OnlineBook 服务接口
        sendSMsToBook(args);
    }

    private static void bookTick(String[] args) {
        int status = 0;
        Communicator ic = null;
        Message message = null;
        try {
            log.info("书籍订阅客户端启动。。。。。。。");
            ic = Util.initialize(args);

            ObjectPrx base = ic.stringToProxy("OnlineBook:default -p 8000");

            OnlineBookPrx onliceBook = OnlineBookPrxHelper.checkedCast(base);

            if(onliceBook == null){
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
            log.info("返回数据信息：书名："+message.name+"说明："+message.content);
        }catch (Exception e){
            e.getStackTrace();
            status = 1;
        }finally {
            if(ic != null){
                ic.destroy();
            }
            // 如果后面还有程序需要运行，这行代码需要注释
//            System.exit(status);
        }
    }

    /**
     * 发送消息客户端
     * @param args
     */
    private static void sendSMs(String[] args) {
        int status = 0;
        Communicator ic = null;
        try {
            ic = Util.initialize(args);

            ObjectPrx base = ic.stringToProxy("SMSService:default -p 8001");

            SMSServicePrx smsServicePrx = SMSServicePrxHelper.checkedCast(base);

            if (smsServicePrx == null) {
                throw new RuntimeException("Invalid proxy");
            }

            smsServicePrx.sendSMs("发送消息给10086");

            log.info("消息客户端启动。。。。。。。");
        }catch (Exception e){
            e.printStackTrace();
            status = 1;
        }finally {
            if(ic != null){
                ic.destroy();
            }
//            System.exit(status);
        }
    }

    private static void sendSMsToBook(String[] args) {
        int status = 0;
        Communicator ic = null;
        try {
            ic = Util.initialize(args);

            ObjectPrx base = ic.stringToProxy("SMSService:default -p 8001");

            SMSServicePrx smsServicePrx = SMSServicePrxHelper.checkedCast(base);

            if (smsServicePrx == null) {
                throw new RuntimeException("Invalid proxy");
            }

            smsServicePrx.sendSMs("book:《葵花宝典秘籍》");

            log.info("从SMSService服务中调用OnlineBook服务接口客户端启动。。。。。。。");
        }catch (Exception e){
            e.printStackTrace();
            status = 1;
        }finally {
            if(ic != null){
                ic.destroy();
            }
            System.exit(status);
        }
    }

}
