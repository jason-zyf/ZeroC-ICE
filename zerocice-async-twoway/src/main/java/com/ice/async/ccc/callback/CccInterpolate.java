package com.ice.async.ccc.callback;

import Ice.LocalException;
import com.ice.async.ccc.generated.Callback_AsyncCcc_getAsyncCccStr;

/**
 * @author zyting
 * @sinne 2020-07-28
 */
public class CccInterpolate extends Callback_AsyncCcc_getAsyncCccStr {

    // 无异常回调
    public void response(String s) {
        System.out.println("接收到java端的回调信息：" + s);
    }

    // 异常回调
    public void exception(LocalException e) {
        System.out.println("接收到java端的异常：" + e.getMessage());
    }

}
