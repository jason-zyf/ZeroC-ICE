package com.ice.book.service.impl;

import Ice.*;
import Ice.Object;
import IceBox.Service;
import com.ice.book.slice2java.book.Message;
import com.ice.book.slice2java.book.OnlineBookPrx;
import com.ice.book.slice2java.book.OnlineBookPrxHelper;
import com.ice.book.slice2java.message._SMSServiceDisp;

import java.lang.Exception;
import java.util.logging.Logger;

/**
 * @author zyting
 * @sinne 2020-07-29
 */
public class SMSServiceImpl extends _SMSServiceDisp implements Service {

    private static Logger log = Logger.getLogger(SMSServiceImpl.class.getSimpleName());
    private ObjectAdapter _adapter;

    private static final long serialVersionUID = 1L;

    public void start(String name, Communicator communicator, String[] strings) {
        _adapter = communicator.createObjectAdapter(name);
        Object object = this;
        _adapter.add(object, communicator.stringToIdentity(name));
        _adapter.activate();
        log.info("SMSService started...");
    }

    public void stop() {
        log.info("SMSService stoped....");
        _adapter.destroy();
    }

    public void sendSMs(String msg, Current __current) {
        if(msg.startsWith("book")){
            try {
                // 如果有这两个配置IceBox.UseSharedCommunicator.OnlineBook=1
                //IceBox.UseSharedCommunicator.SMSService=1
                // 使得两个服务绑定在同一个communicator上，
                // 可以通过SMSService的communicator直接获取“OnlineBook”这个Endpoint地址
                // 如果没有上面两个配置，只能通过_adapter.getCommunicator().stringToProxy("OnlineBook：default -p 10000");获取
                ObjectPrx base = _adapter.getCommunicator().stringToProxy("OnlineBook");
                OnlineBookPrx onlineBook = OnlineBookPrxHelper.checkedCast(base);
                //调用服务方法
                Message bookMsg = new Message();
                bookMsg.name = "葵花宝典秘籍";
                bookMsg.type = 3;
                bookMsg.price = 99.99;
                bookMsg.valid = true;
                bookMsg.content = "欲练此功，必先自宫！！！";
                Message messsag = onlineBook.bookTick(bookMsg);
                log.info("在SMSService中调用OnlineBook服务中的bookTick方法。。。。。返回购买书籍名："+messsag.name);
            }catch (Exception e){
                throw new RuntimeException(e);
            }
        }else{
            log.info("send msg: " + msg);
        }
    }
}
