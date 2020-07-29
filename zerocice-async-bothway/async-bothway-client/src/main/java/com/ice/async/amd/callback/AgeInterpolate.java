package com.ice.async.amd.callback;

import Ice.LocalException;
import com.ice.async.amd.generated.AMD_AsyncAmd_getAge;
import com.ice.async.amd.generated.Callback_AsyncAmd_getAge;

import java.util.logging.Logger;

/**
 * @author zyting
 * @sinne 2020-07-29
 * 年龄方法的回调类
 */
public class AgeInterpolate extends Callback_AsyncAmd_getAge {

    private static Logger log = Logger.getLogger(AgeInterpolate.class.getSimpleName());

    public void response(String s) {
        log.info("收到回调信息：" + s);
        if(s.contains("已成年")){
            log.info("处理回调业务逻辑，可以领证。。。。");
        }else {
            log.info("处理回调业务逻辑，不可以领证。。。。");
        }
    }

    public void exception(LocalException e) {
        log.info("收到回调异常：" + e.getMessage());
    }
}
