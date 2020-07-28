package com.test.ice.async.callback;

import Ice.LocalException;
import com.test.ice.async.generated.Callback_TestAsyncAmi_getAsyncStr;

/**
 * @author zyting
 * @sinne 2020-07-28
 * Ami 客户端回调
 */
public class AsyncAmi_interpolateI extends Callback_TestAsyncAmi_getAsyncStr {

    @Override
    public void response(String s) {
        System.out.println("客户端收到回调信息：" + s);
    }

    @Override
    public void exception(LocalException e) {
        System.out.println("客户端收到异常：" + e.getMessage());
    }
}
