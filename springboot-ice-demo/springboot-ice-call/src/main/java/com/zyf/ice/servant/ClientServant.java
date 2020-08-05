package com.zyf.ice.servant;

import Ice.Current;
import org.springframework.stereotype.Service;
import slice2java._IServerCallBackDisp;

/**
 * @author zyting
 * @sinne 2020-08-05
 * 客户端处理服务端返回
 */
@Service
public class ClientServant extends _IServerCallBackDisp {

    @Override
    public boolean response(String msg, Current __current) {
        System.out.println("serverCallBack:" + msg);
        return false;
    }
}
