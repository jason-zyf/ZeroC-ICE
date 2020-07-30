package com.ice.book.service.impl;

import Ice.Communicator;
import Ice.Current;
import Ice.Object;
import Ice.ObjectAdapter;
import com.ice.book.slice2java.book.Message;
import com.ice.book.slice2java.book._OnlineBookDisp;

import java.util.logging.Logger;

/**
 * @author zyting
 * @sinne 2020-07-29
 *
 */
public class OnlineBookImpl extends _OnlineBookDisp implements IceBox.Service {

    private static Logger log = Logger.getLogger(OnlineBookImpl.class.getSimpleName());
    private ObjectAdapter _adapter;

    private static final long serialVersionUID = 1L;

    public Message bookTick(Message msg, Current __current) {
        // 为了打压调用堆栈故意抛出的异常
//        if(msg.content.startsWith("ersror")){
//            throw new RuntimeException("bad call param");
//        }
        log.info("bookTick方法执行。。订购这本书：" + msg.name);
        return msg;
    }

    public void start(String name, Communicator communicator, String[] strings) {
        // 创建objectAdapter，这里和service同名
        _adapter = communicator.createObjectAdapter(name);
        // 创建servant并激活
        Object object = this;
        _adapter.add(object, communicator.stringToIdentity(name));

        _adapter.activate();

        log.info(name + " 服务 started ");
    }

    public void stop() {
        log.info(this._adapter.getName()+ " stoped ");
        // 消费adapter
        _adapter.destroy();
    }
}
