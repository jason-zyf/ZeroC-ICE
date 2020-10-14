// **********************************************************************
//
// Copyright (c) 2003-2017 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.4
//
// <auto-generated>
//
// Generated from file `call.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package slice2java;

/**
 * ice服务端
 **/
public interface IServerPrx extends Ice.ObjectPrx
{
    /**
     * 服务端设置客户端回调对象
     **/
    public boolean setCallBack(Ice.Identity id);

    /**
     * 服务端设置客户端回调对象
     * @param __ctx The Context map to send with the invocation.
     **/
    public boolean setCallBack(Ice.Identity id, java.util.Map<String, String> __ctx);

    /**
     * 服务端设置客户端回调对象
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_setCallBack(Ice.Identity id);

    /**
     * 服务端设置客户端回调对象
     * @param __ctx The Context map to send with the invocation.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_setCallBack(Ice.Identity id, java.util.Map<String, String> __ctx);

    /**
     * 服务端设置客户端回调对象
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_setCallBack(Ice.Identity id, Ice.Callback __cb);

    /**
     * 服务端设置客户端回调对象
     * @param __ctx The Context map to send with the invocation.
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_setCallBack(Ice.Identity id, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    /**
     * 服务端设置客户端回调对象
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_setCallBack(Ice.Identity id, Callback_IServer_setCallBack __cb);

    /**
     * 服务端设置客户端回调对象
     * @param __ctx The Context map to send with the invocation.
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_setCallBack(Ice.Identity id, java.util.Map<String, String> __ctx, Callback_IServer_setCallBack __cb);

    /**
     * 服务端设置客户端回调对象
     * @param __responseCb The lambda response callback.
     * @param __exceptionCb The lambda exception callback.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_setCallBack(Ice.Identity id, 
                                             IceInternal.Functional_BoolCallback __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    /**
     * 服务端设置客户端回调对象
     * @param __responseCb The lambda response callback.
     * @param __exceptionCb The lambda exception callback.
     * @param __sentCb The lambda sent callback.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_setCallBack(Ice.Identity id, 
                                             IceInternal.Functional_BoolCallback __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                             IceInternal.Functional_BoolCallback __sentCb);

    /**
     * 服务端设置客户端回调对象
     * @param __ctx The Context map to send with the invocation.
     * @param __responseCb The lambda response callback.
     * @param __exceptionCb The lambda exception callback.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_setCallBack(Ice.Identity id, 
                                             java.util.Map<String, String> __ctx, 
                                             IceInternal.Functional_BoolCallback __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    /**
     * 服务端设置客户端回调对象
     * @param __ctx The Context map to send with the invocation.
     * @param __responseCb The lambda response callback.
     * @param __exceptionCb The lambda exception callback.
     * @param __sentCb The lambda sent callback.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_setCallBack(Ice.Identity id, 
                                             java.util.Map<String, String> __ctx, 
                                             IceInternal.Functional_BoolCallback __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                             IceInternal.Functional_BoolCallback __sentCb);

    /**
     * 服务端设置客户端回调对象
     * @param __result The asynchronous result object.
     **/
    public boolean end_setCallBack(Ice.AsyncResult __result);

    /**
     * 服务端处理客户端请求
     **/
    public boolean request(String msg);

    /**
     * 服务端处理客户端请求
     * @param __ctx The Context map to send with the invocation.
     **/
    public boolean request(String msg, java.util.Map<String, String> __ctx);

    /**
     * 服务端处理客户端请求
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_request(String msg);

    /**
     * 服务端处理客户端请求
     * @param __ctx The Context map to send with the invocation.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_request(String msg, java.util.Map<String, String> __ctx);

    /**
     * 服务端处理客户端请求
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_request(String msg, Ice.Callback __cb);

    /**
     * 服务端处理客户端请求
     * @param __ctx The Context map to send with the invocation.
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_request(String msg, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    /**
     * 服务端处理客户端请求
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_request(String msg, Callback_IServer_request __cb);

    /**
     * 服务端处理客户端请求
     * @param __ctx The Context map to send with the invocation.
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_request(String msg, java.util.Map<String, String> __ctx, Callback_IServer_request __cb);

    /**
     * 服务端处理客户端请求
     * @param __responseCb The lambda response callback.
     * @param __exceptionCb The lambda exception callback.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_request(String msg, 
                                         IceInternal.Functional_BoolCallback __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    /**
     * 服务端处理客户端请求
     * @param __responseCb The lambda response callback.
     * @param __exceptionCb The lambda exception callback.
     * @param __sentCb The lambda sent callback.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_request(String msg, 
                                         IceInternal.Functional_BoolCallback __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                         IceInternal.Functional_BoolCallback __sentCb);

    /**
     * 服务端处理客户端请求
     * @param __ctx The Context map to send with the invocation.
     * @param __responseCb The lambda response callback.
     * @param __exceptionCb The lambda exception callback.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_request(String msg, 
                                         java.util.Map<String, String> __ctx, 
                                         IceInternal.Functional_BoolCallback __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    /**
     * 服务端处理客户端请求
     * @param __ctx The Context map to send with the invocation.
     * @param __responseCb The lambda response callback.
     * @param __exceptionCb The lambda exception callback.
     * @param __sentCb The lambda sent callback.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_request(String msg, 
                                         java.util.Map<String, String> __ctx, 
                                         IceInternal.Functional_BoolCallback __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                         IceInternal.Functional_BoolCallback __sentCb);

    /**
     * 服务端处理客户端请求
     * @param __result The asynchronous result object.
     **/
    public boolean end_request(Ice.AsyncResult __result);
}