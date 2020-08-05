package com.zyf.ice.spring.server;

import Ice.Current;
import Ice.StringHolder;
import org.springframework.stereotype.Service;
import slice2java._HelloIDisp;

/**
 * @author zyting
 * @sinne 2020-08-05
 */
@Service
public class HelloServant extends _HelloIDisp {

    @Override
    public int hello(String instr, StringHolder outstr, Current __current) {
        System.out.println("spring server接受："+instr+" 时间："+System.currentTimeMillis());
        outstr.value="hello client-spring";
        return 0;
    }

}
