package com.ice.sync.bothway.service.impl;

import Ice.Current;
import com.ice.sync.bothway.generated._HelloDisp;

import java.util.logging.Logger;

/**
 * @author zyting
 * @sinne 2020-07-29
 * 接口的具体实现类
 */
public class HelloImpl extends _HelloDisp {

    private static final long serialVersionUID = -3966457693815687559L;
    private Logger log = Logger.getLogger(this.getClass().getSimpleName());

    public String sayHello(String s, Current __current) {
        log.info("具体的服务接口实现类中的sayHello方法被调用了。。。");
        return "Hello " + s;
    }

}
