package com.ice.book.server;

/**
 * @author zyting
 * @sinne 2020-07-29
 * 启动服务
 */
public class BookServer {

    public static void main(String[] args) {
        IceBox.Server server = new IceBox.Server();
        server.main(new String[]{"--Ice.Config=config.properties"});
    }

}
