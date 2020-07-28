package com.ice.async.ccc.service.impl;

import Ice.Current;
import com.ice.async.ccc.generated.AMD_AsyncCcc_getAsyncCccStr;
import com.ice.async.ccc.generated._AsyncCccDisp;

/**
 * @author zyting
 * @sinne 2020-07-28
 * C++ 端接受到请求后的具体实现类
 */
public class CccImpl extends _AsyncCccDisp {


    public void getAsyncCccStr_async(AMD_AsyncCcc_getAsyncCccStr __cb, String s, Current __current) {
        try {
            Thread.sleep(1000);
            System.out.println("C++服务端执行方法。。。。");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 这里已经将结果返回给客户端了
        __cb.ice_response(s);  // 接信息返回给客户端

        // 执行其他的操作
        System.out.println("将信息返回给Java端，并执行其他扫尾操作。。。。");
    }

}
