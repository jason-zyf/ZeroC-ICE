package com.ice.async.ami.callback;

import Ice.LocalException;
import com.ice.async.ami.generated.Callback_AsyncAmi_getAsyncStr;

/**
 * @author zyting
 * @sinne 2020-07-28
 * Ami 客户端回调
 */
public class AsyncAmi_interpolate extends Callback_AsyncAmi_getAsyncStr {

    @Override
    public void response(String s) {
        System.out.println("客户端收到回调信息：" + s);
    }

    @Override
    public void exception(LocalException e) {
        System.out.println("客户端收到异常：" + e.getMessage());
    }
}
