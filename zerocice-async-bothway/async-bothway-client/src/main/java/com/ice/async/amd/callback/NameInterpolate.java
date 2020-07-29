package com.ice.async.amd.callback;

import Ice.LocalException;
import com.ice.async.amd.generated.Callback_AsyncAmd_getName;

import java.util.logging.Logger;

/**
 * @author zyting
 * @sinne 2020-07-29
 */
public class NameInterpolate extends Callback_AsyncAmd_getName {

    private static Logger log = Logger.getLogger(NameInterpolate.class.getSimpleName());

    public void response(String s) {
        log.info("收到回调信息：" + s);
        if(s.contains("白名单")){
            log.info("处理回调业务逻辑，登录成功。。。。");
        }else {
            log.info("处理回调业务逻辑，拒绝登录。。。。");
        }
    }

    public void exception(LocalException e) {
        log.info("收到回调异常：" + e.getMessage());
    }
}

