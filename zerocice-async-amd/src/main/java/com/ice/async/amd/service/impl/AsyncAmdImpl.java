package com.ice.async.amd.service.impl;

import Ice.Current;
import com.ice.async.amd.generated.AMD_AsyncAmd_getAsyncAmdStr;
import com.ice.async.amd.generated._AsyncAmdDisp;

/**
 * @author zyting
 * @sinne 2020-07-28
 * 服务实现类
 * 1、抓住持有返回方法的对象在需要的时候再返回结果（amd）,这就提供了更多的扩展方式
 * 2、在使用AMD时，服务器可以接受一个请求，然后挂起其处理，以尽快释放分派线程。
 * 当处理恢复、结果已得出时，服务器要使用Ice run time提供的回调对象，显式地发送响应。
 * 用实际的术语说，AMD操作通常会把请求数据（也就是对象和操作参数）放入队列，供应用的某个线程（或线程池）
 * 随后处理。这样，服务器就使分派线程的使用率降到了最低限度，能够高效地支持数千并发客户。另外，AMD还可用于
 * 需要在完成了客户的请求之后继续进行处理的操作。为了使客户的延迟降到最低限度，操作在返回结果后，仍留在分派线程中，继续用分派线程执行其他工作。）
 * 3、每次服务器把每次请求都放在线程池中挂起，直至开始处理这个请求。并且在将结果返回给客户端后还可以接着执行
 * 其他操作。比如以下扫尾工作不用再客户端结果钱做，可以之后做，明显降低客户等待时间。
 */
public class AsyncAmdImpl extends _AsyncAmdDisp {

    @Override
    public void getAsyncAmdStr_async(AMD_AsyncAmd_getAsyncAmdStr __cb, String s, Current __current) {

        try {
            Thread.sleep(1000);
            System.out.println("服务端执行方法。。。。");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 这里已经将结果返回给客户端了
        __cb.ice_response(s);  // 接信息返回给客户端
    }

}
