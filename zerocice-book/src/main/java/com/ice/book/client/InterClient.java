package com.ice.book.client;

import Ice.Communicator;
import Ice.ObjectPrx;
import Ice.Util;
import com.ice.book.slice2java.SMSServicePrx;
import com.ice.book.slice2java.SMSServicePrxHelper;

import java.awt.image.SampleModel;
import java.util.logging.Logger;

/**
 * @author zyting
 * @sinne 2020-07-30
 */
public class InterClient {

    public static final Logger log = Logger.getLogger(InterClient.class.getSimpleName());

    public static void main(String[] args) {

        // 只调用SMSService 接口
//        sendSMS("发送短信",59,"发短信购买ICE权威指南。",args);

        // 在 SMSService 中调用 OnlineBookService,演示ICE服务间的调用
        sendSMS("book ICE权威指南",59,"这是一本介绍ICE的书籍。",args);
    }

    private static void sendSMS(String name, int price, String content, String[] args) {
        int status = 0;
        Communicator ic = null;
        try {
            ic = Util.initialize(args);
            ObjectPrx base = ic.stringToProxy("SMSService:default -p 9001");
            SMSServicePrx smsServicePrx = SMSServicePrxHelper.checkedCast(base);
            if(smsServicePrx == null){
                throw new Error("Invalid proxy");
            }
            smsServicePrx.sendSMS(name,price,content);
            log.info("调用发送短信接口。。。。。");
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

}
