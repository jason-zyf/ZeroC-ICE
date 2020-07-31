1、使用ice registry组件的使用方法步骤
1）创建registry.cfg配置文件
2）在registry.cfg目录执行以下命令，生成的二进制文件，用来保存服务的注册信息，且执行完这个命令后的窗口不能关闭，否则去服务启动失败
icegridregistry --Ice.Config=registry.cfg
3）在IceBox的配置文件config.properties增加以下配置
Ice.Default.Locator=IceGrid/Locator:tcp -h localhost -p 4061
OnlineBook.AdapterId=OnlineBookAdapter
SMSService.AdapterId=SMSServicesAdapter
4）修改客户端代码，参考RegistryClient类代码
通过String[] initParams = new String[]{"--Ice.Default.Locator=IceGrid/Locator:tcp -h localhost -p 4061"};初始化ic
并可用service@adapterId这种InDirect的Endpoint名字的方式来查询定位服务了，例如
ObjectPrx base = ic.stringToProxy("OnlineBook@OnlineBookAdapter");




