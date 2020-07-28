package com.ice.async.ami.service.impl;

import Ice.Current;
import com.ice.async.ami.generated._AsyncAmiDisp;

/**
 * @author zyting
 * @sinne 2020-07-28
 * ami服务端实现类（异步方法调用）
 * 仅仅基于ice的同步方法扩展了同步的扩展方式，其他理念改动不大，使用起来好理解，
 * 但服务端依赖异步线程数量配置，线程数量如果爆仓，后面的请求全部都会丢失
 * 服务端直接实现业务的返回方法（ami 直接return结果）
 */
public class AsyncAmiImpl extends _AsyncAmiDisp {


    public String getAsyncStr(String s, Current __current) {
        try {
            Thread.sleep(2000);
            System.out.println("睡眠2秒后返回结果数据！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return  s;
    }
}
