package com.ice.book.service;

import Ice.Communicator;
import Ice.Current;
import Ice.ObjectAdapter;
import Ice.ObjectPrx;
import IceBox.Service;
import com.ice.book.slice2java.OnlineBookPrx;
import com.ice.book.slice2java.OnlineBookPrxHelper;
import com.ice.book.slice2java._SMSServiceDisp;

import java.util.logging.Logger;

/**
 * @author zyting
 * @sinne 2020-07-30
 * 发送短信的实现类
 * Ice service之间的调用
 * 如果name是以book，则内部调用OnlineBookService购买图书，否则就是发送短信
 */
public class ICESMSService extends _SMSServiceDisp implements Service {

    public static final Logger log = Logger.getLogger(ICESMSService.class.getSimpleName());
    private ObjectAdapter _adapter;

    @Override
    public void start(String name, Communicator communicator, String[] strings) {
        // 创建objectAdapter,这里和service同名
        _adapter = communicator.createObjectAdapter(name);
        // 传Serant并激活
        Ice.Object object = this;
        _adapter.add(object,communicator.stringToIdentity(name));
        _adapter.activate();
        log.info(name + " started.");
    }

    @Override
    public void stop() {
        log.info(this._adapter.getName() + " stoped.");
        _adapter.destroy();
    }

    @Override
    public void sendSMS(String name, double price, String content, Current __current) {
        // ice服务间的调用
        if(name.startsWith("book")){
            ObjectPrx base = _adapter.getCommunicator().stringToProxy("OnlineBook");
            OnlineBookPrx onlineBookPrx = OnlineBookPrxHelper.checkedCast(base);
            if(null != onlineBookPrx){
                onlineBookPrx.bookTick(name, price, content);
                log.info("通过短信购买图书！...params->[name=" + name + ",price=" + price + ",content=" + content + "].");
            }else {
                throw new Error("Can't find OnlinkBook Service.");
            }
        }else {
            // 简单调用返回数据
            log.info("发送短信成功...params->[name=" + name + ",price=" + price + ",content=" + content + "].");
        }
    }

}
