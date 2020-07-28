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
// Generated from file `Ccc.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.ice.async.ccc.generated;

public interface AsyncCccPrx extends Ice.ObjectPrx
{
    public String getAsyncCccStr(String s);

    public String getAsyncCccStr(String s, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getAsyncCccStr(String s);

    public Ice.AsyncResult begin_getAsyncCccStr(String s, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getAsyncCccStr(String s, Ice.Callback __cb);

    public Ice.AsyncResult begin_getAsyncCccStr(String s, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getAsyncCccStr(String s, Callback_AsyncCcc_getAsyncCccStr __cb);

    public Ice.AsyncResult begin_getAsyncCccStr(String s, java.util.Map<String, String> __ctx, Callback_AsyncCcc_getAsyncCccStr __cb);

    public Ice.AsyncResult begin_getAsyncCccStr(String s, 
                                                IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_getAsyncCccStr(String s, 
                                                IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_getAsyncCccStr(String s, 
                                                java.util.Map<String, String> __ctx, 
                                                IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_getAsyncCccStr(String s, 
                                                java.util.Map<String, String> __ctx, 
                                                IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                IceInternal.Functional_BoolCallback __sentCb);

    public String end_getAsyncCccStr(Ice.AsyncResult __result);
}