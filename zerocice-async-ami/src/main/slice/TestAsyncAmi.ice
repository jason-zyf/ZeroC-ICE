[["java:package:com.test.ice.async"]] // 定义java包名  父结构
module generated    //模块包名
{
["ami"]interface TestAsyncAmi   //接口服务名称,接口内的方法全部都是ami模式
    {
        string getAsyncStr(string s);   //具体的方法
    };
};