package com.ice.async.java.service.impl;

import Ice.Current;
import com.ice.async.java.generated.AMD_AsyncJava_getAsyncJavaStr;
import com.ice.async.java.generated._AsyncJavaDisp;

/**
 * @author zyting
 * @sinne 2020-07-28
 * java 端接受请求后的具体实现
 */
public class JavaImpl extends _AsyncJavaDisp {

    public void getAsyncJavaStr_async(AMD_AsyncJava_getAsyncJavaStr __cb, String s, Current __current) {
        try {
            Thread.sleep(1000);
            System.out.println("java服务端执行方法。。。。");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 这里已经将结果返回给客户端了
        __cb.ice_response("获取c++端变化数据："+s);  // 将执行结果返回给java客户端

        // 执行其他的操作
        System.out.println("将信息返回给c++端，并执行其他扫尾操作。。。。");

    }

}
