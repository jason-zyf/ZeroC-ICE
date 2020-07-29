package com.ice.async.amd.service.impl;

import Ice.Current;
import com.ice.async.amd.generated.AMD_AsyncAmd_getAge;
import com.ice.async.amd.generated.AMD_AsyncAmd_getName;
import com.ice.async.amd.generated._AsyncAmdDisp;

/**
 * @author zyting
 * @sinne 2020-07-29
 * 服务的具体实现方法
 */
public class AmdImpl extends _AsyncAmdDisp {

    /**
     * 根据名字判断是否是白名单内
     * @param __cb
     * @param s
     * @param __current
     */
    public void getName_async(AMD_AsyncAmd_getName __cb, String s, Current __current) {
        try {
            Thread.sleep(1000);
            System.out.println("服务端执行白名单方法。。。。");
            String flag = "黑名单";
            if(s.startsWith("a")){
                flag = "白名单";
            }
            // 这里已经将结果返回给客户端了
            __cb.ice_response(flag+":" + s);  // 返回给客户端
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 根据年龄判断是否成年
     * @param __cb
     * @param age
     * @param __current
     */
    public void getAge_async(AMD_AsyncAmd_getAge __cb, int age, Current __current) {
        try {
            Thread.sleep(1000);
            System.out.println("服务端执行判断是否成年方法。。。。");
            String flag = "已成年";
            if(age < 18){
                flag = "未成年";
            }
            // 这里已经将结果返回给客户端了
            __cb.ice_response(flag + ": " + age);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
