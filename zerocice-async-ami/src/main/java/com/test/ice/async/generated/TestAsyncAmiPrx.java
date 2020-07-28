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
// Generated from file `TestAsyncAmi.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.test.ice.async.generated;

public interface TestAsyncAmiPrx extends Ice.ObjectPrx
{
    public String getAsyncStr(String s);

    public String getAsyncStr(String s, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getAsyncStr(String s);

    public Ice.AsyncResult begin_getAsyncStr(String s, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getAsyncStr(String s, Ice.Callback __cb);

    public Ice.AsyncResult begin_getAsyncStr(String s, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getAsyncStr(String s, Callback_TestAsyncAmi_getAsyncStr __cb);

    public Ice.AsyncResult begin_getAsyncStr(String s, java.util.Map<String, String> __ctx, Callback_TestAsyncAmi_getAsyncStr __cb);

    public Ice.AsyncResult begin_getAsyncStr(String s, 
                                             IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_getAsyncStr(String s, 
                                             IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                             IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_getAsyncStr(String s, 
                                             java.util.Map<String, String> __ctx, 
                                             IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_getAsyncStr(String s, 
                                             java.util.Map<String, String> __ctx, 
                                             IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                             IceInternal.Functional_BoolCallback __sentCb);

    public String end_getAsyncStr(Ice.AsyncResult __result);
}
