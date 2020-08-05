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
// Generated from file `test.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package slice2java;

public interface HelloIPrx extends Ice.ObjectPrx
{
    public int hello(String instr, Ice.StringHolder outstr);

    public int hello(String instr, Ice.StringHolder outstr, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_hello(String instr);

    public Ice.AsyncResult begin_hello(String instr, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_hello(String instr, Ice.Callback __cb);

    public Ice.AsyncResult begin_hello(String instr, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_hello(String instr, Callback_HelloI_hello __cb);

    public Ice.AsyncResult begin_hello(String instr, java.util.Map<String, String> __ctx, Callback_HelloI_hello __cb);

    public interface FunctionalCallback_HelloI_hello_Response
    {
        void apply(int __ret, String outstr);
    }

    public Ice.AsyncResult begin_hello(String instr, 
                                       FunctionalCallback_HelloI_hello_Response __responseCb, 
                                       IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_hello(String instr, 
                                       FunctionalCallback_HelloI_hello_Response __responseCb, 
                                       IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                       IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_hello(String instr, 
                                       java.util.Map<String, String> __ctx, 
                                       FunctionalCallback_HelloI_hello_Response __responseCb, 
                                       IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_hello(String instr, 
                                       java.util.Map<String, String> __ctx, 
                                       FunctionalCallback_HelloI_hello_Response __responseCb, 
                                       IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                       IceInternal.Functional_BoolCallback __sentCb);

    public int end_hello(Ice.StringHolder outstr, Ice.AsyncResult __result);
}
