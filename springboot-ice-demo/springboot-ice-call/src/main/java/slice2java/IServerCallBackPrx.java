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
 * ice客户端
 **/
public interface IServerCallBackPrx extends Ice.ObjectPrx
{
    /**
     * 客户端处理服务端返回
     **/
    public boolean response(String msg);

    /**
     * 客户端处理服务端返回
     * @param __ctx The Context map to send with the invocation.
     **/
    public boolean response(String msg, java.util.Map<String, String> __ctx);

    /**
     * 客户端处理服务端返回
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_response(String msg);

    /**
     * 客户端处理服务端返回
     * @param __ctx The Context map to send with the invocation.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_response(String msg, java.util.Map<String, String> __ctx);

    /**
     * 客户端处理服务端返回
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_response(String msg, Ice.Callback __cb);

    /**
     * 客户端处理服务端返回
     * @param __ctx The Context map to send with the invocation.
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_response(String msg, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    /**
     * 客户端处理服务端返回
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_response(String msg, Callback_IServerCallBack_response __cb);

    /**
     * 客户端处理服务端返回
     * @param __ctx The Context map to send with the invocation.
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_response(String msg, java.util.Map<String, String> __ctx, Callback_IServerCallBack_response __cb);

    /**
     * 客户端处理服务端返回
     * @param __responseCb The lambda response callback.
     * @param __exceptionCb The lambda exception callback.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_response(String msg, 
                                          IceInternal.Functional_BoolCallback __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    /**
     * 客户端处理服务端返回
     * @param __responseCb The lambda response callback.
     * @param __exceptionCb The lambda exception callback.
     * @param __sentCb The lambda sent callback.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_response(String msg, 
                                          IceInternal.Functional_BoolCallback __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                          IceInternal.Functional_BoolCallback __sentCb);

    /**
     * 客户端处理服务端返回
     * @param __ctx The Context map to send with the invocation.
     * @param __responseCb The lambda response callback.
     * @param __exceptionCb The lambda exception callback.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_response(String msg, 
                                          java.util.Map<String, String> __ctx, 
                                          IceInternal.Functional_BoolCallback __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    /**
     * 客户端处理服务端返回
     * @param __ctx The Context map to send with the invocation.
     * @param __responseCb The lambda response callback.
     * @param __exceptionCb The lambda exception callback.
     * @param __sentCb The lambda sent callback.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_response(String msg, 
                                          java.util.Map<String, String> __ctx, 
                                          IceInternal.Functional_BoolCallback __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                          IceInternal.Functional_BoolCallback __sentCb);

    /**
     * 客户端处理服务端返回
     * @param __result The asynchronous result object.
     **/
    public boolean end_response(Ice.AsyncResult __result);
}
