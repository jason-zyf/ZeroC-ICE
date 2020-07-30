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
// Generated from file `AsyncAmd.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.ice.async.amd.generated;

public interface AsyncAmdPrx extends Ice.ObjectPrx
{
    public String getName(String s);

    public String getName(String s, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getName(String s);

    public Ice.AsyncResult begin_getName(String s, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getName(String s, Ice.Callback __cb);

    public Ice.AsyncResult begin_getName(String s, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getName(String s, Callback_AsyncAmd_getName __cb);

    public Ice.AsyncResult begin_getName(String s, java.util.Map<String, String> __ctx, Callback_AsyncAmd_getName __cb);

    public Ice.AsyncResult begin_getName(String s, 
                                         IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_getName(String s, 
                                         IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                         IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_getName(String s, 
                                         java.util.Map<String, String> __ctx, 
                                         IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_getName(String s, 
                                         java.util.Map<String, String> __ctx, 
                                         IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                         IceInternal.Functional_BoolCallback __sentCb);

    public String end_getName(Ice.AsyncResult __result);

    public String getAge(int age);

    public String getAge(int age, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getAge(int age);

    public Ice.AsyncResult begin_getAge(int age, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getAge(int age, Ice.Callback __cb);

    public Ice.AsyncResult begin_getAge(int age, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getAge(int age, Callback_AsyncAmd_getAge __cb);

    public Ice.AsyncResult begin_getAge(int age, java.util.Map<String, String> __ctx, Callback_AsyncAmd_getAge __cb);

    public Ice.AsyncResult begin_getAge(int age, 
                                        IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_getAge(int age, 
                                        IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                        IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_getAge(int age, 
                                        java.util.Map<String, String> __ctx, 
                                        IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_getAge(int age, 
                                        java.util.Map<String, String> __ctx, 
                                        IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                        IceInternal.Functional_BoolCallback __sentCb);

    public String end_getAge(Ice.AsyncResult __result);
}