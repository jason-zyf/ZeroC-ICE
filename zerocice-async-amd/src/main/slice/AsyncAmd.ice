[["java:package:com.ice.async.amd"]] // 定义java包名  父结构
module generated    //模块包名
{
["amd"]interface AsyncAmd   //接口服务名称,接口内的方法全部都是ami模式
    {
        string getAsyncAmdStr(string s);   //具体的方法
    };
};