package com.ice.async.amd.callback;

import Ice.LocalException;
import com.ice.async.amd.generated.Callback_AsyncAmd_getAsyncAmdStr;

/**
 * @author zyting
 * @sinne 2020-07-28
 * 客户端AMD模式异步回调方式
 * AMD_AsyncAmd_getAsyncAmdStr为ICE自动生成的接口回调抽象类（AMD_slice定义的接口名_接口中的方法名）
 * Callback_AsyncAmd_getAsyncAmdStr
 */
public class AsyncAmd_interpolate extends Callback_AsyncAmd_getAsyncAmdStr {

    // 无异常回调
    @Override
    public void response(String s) {
        System.out.println("收到回调信息："+ s);
    }

    // 异常回调
    @Override
    public void exception(LocalException e) {
        System.out.println("收到异常："+e.getMessage());
    }
}
