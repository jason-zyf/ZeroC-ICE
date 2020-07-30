package com.ice.book.client;

/**
 * @author zyting
 * @sinne 2020-07-30
 * 启动服务
 */
public class Server {

    public static void main(String[] args) {
        IceBox.Server server = new IceBox.Server();
        server.main(new String[]{"--Ice.Config=icebox.properties"});
    }
}
