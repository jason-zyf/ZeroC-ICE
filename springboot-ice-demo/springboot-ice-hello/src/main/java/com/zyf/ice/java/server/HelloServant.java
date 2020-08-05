package com.zyf.ice.java.server;

import Ice.Current;
import Ice.StringHolder;
import slice2java._HelloIDisp;

/**
 * @author zyting
 * @sinne 2020-08-05
 */
public class HelloServant extends _HelloIDisp {

    @Override
    public int hello(String instr, StringHolder outstr, Current __current) {
        System.out.println("server接受："+instr+" 时间："+System.currentTimeMillis());
        outstr.value="hello client";
        return 0;
    }
}
