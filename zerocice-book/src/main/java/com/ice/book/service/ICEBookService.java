package com.ice.book.service;

import Ice.Communicator;
import Ice.Current;
import Ice.ObjectAdapter;
import IceBox.Service;
import com.ice.book.slice2java._OnlineBookDisp;

import java.util.logging.Logger;

/**
 * @author zyting
 * @sinne 2020-07-30
 * book 的实现类
 */
public class ICEBookService extends _OnlineBookDisp implements Service {

    public static final Logger log = Logger.getLogger(ICEBookService.class.getSimpleName());
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
    public void bookTick(String name, double price, String content, Current __current) {
        log.info("Call bookTick()...params->[name=" + name + ",price=" + price + ",content=" + content + "].");
    }

}
