此工程是模拟客户端与服务端分离在不同服务器上的场景
sync-bothway-client  模拟客户端，需要将ice文件通过slice2java编译
sync-bothway-server  模拟服务端，需要将ice文件通过slice2java编译

通过slice2java生成的文件中，在客户端只需要保留
Callback_Hello_sayHello、HelloPrx、HelloPrxHelper这3个文件即可运行


通过slice2java生成的文件中，在服务端可以注释掉
_Marker.java、HelloHolder.java、HelloPrxHolder.java 这3个文件也可以运行


