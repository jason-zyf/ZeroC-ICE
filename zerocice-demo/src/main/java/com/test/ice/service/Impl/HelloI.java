package com.test.ice.service.Impl;

import Ice.Current;
import com.test.ice.service.generated._HelloDisp;

import java.util.logging.Logger;

/**
 * @author zyting
 * @sinne 2020-07-27
 *
 */
public class HelloI extends _HelloDisp {

    private static final long serialVersionUID = -3966457693815687559L;
    private Logger log = Logger.getLogger(this.getClass().getSimpleName());

    public String sayHello(String s, Current __current) {
        log.info("具体的服务接口实现类中的sayHello方法被调用了。。。");
        return "Hello " + s;
    }

}
