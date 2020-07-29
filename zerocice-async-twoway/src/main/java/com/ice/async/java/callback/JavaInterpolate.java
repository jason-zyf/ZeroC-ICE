package com.ice.async.java.callback;

import Ice.LocalException;
import com.ice.async.java.generated.Callback_AsyncJava_getAsyncJavaStr;

/**
 * @author zyting
 * @sinne 2020-07-28
 * java端回调函数
 */
public class JavaInterpolate extends Callback_AsyncJava_getAsyncJavaStr {

    // 无异常回调
    public void response(String s) {
        System.out.println("接收到c++端的回调信息：" + s);
    }

    // 异常回调
    public void exception(LocalException e) {
        System.out.println("接收到c++端的异常信息：" + e.getMessage());
    }

}
