package com.ice.book.client;

import Ice.Communicator;
import Ice.ObjectPrx;
import Ice.Util;
import com.ice.book.slice2java.OnlineBookPrx;
import com.ice.book.slice2java.OnlineBookPrxHelper;
import com.ice.book.slice2java.SMSServicePrx;
import com.ice.book.slice2java.SMSServicePrxHelper;

import java.util.logging.Logger;

/**
 * @author zyting
 * @sinne 2020-07-30
 * 调用接口
 */
public class Client {

    public static final Logger log = Logger.getLogger(Client.class.getSimpleName());

    public static void main(String[] args) {
        // 调用OnlineBook 接口
        bookTick(args);
        //调用SMSService接口
        sendSMS(args);
    }

    private static void bookTick(String[] args) {
        int status = 0;
        Communicator ic = null;
        try {
            ic = Util.initialize(args);
            ObjectPrx base = ic.stringToProxy("OnlineBook:default -p 9000");
            OnlineBookPrx onlineBookPrx = OnlineBookPrxHelper.checkedCast(base);
            if(onlineBookPrx == null){
                throw new RuntimeException("Invalid proxy");
            }
            onlineBookPrx.bookTick("ICE权威指南", 59, "这是一本介绍ICE的书籍");
            log.info("调用图书服务接口。。。。。");
        }catch (Exception e){
            e.printStackTrace();
            status = 1;
        }finally {
            if(ic != null){
                ic.destroy();
            }
        }
//        System.exit(status);
    }

    private static void sendSMS(String[] args) {
        int status = 0;
        Communicator ic = null;
        try {
            ic = Util.initialize(args);
            ObjectPrx base = ic.stringToProxy("SMSService:default -p 9001");
            SMSServicePrx smsServicePrx = SMSServicePrxHelper.checkedCast(base);
            if(smsServicePrx == null){
                throw new RuntimeException("Invalid proxy");
            }
            smsServicePrx.sendSMS("ICE权威指南", 59, "这是一本介绍ICE的书籍");
            log.info("调用发送短信服务接口。。。。。");
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
