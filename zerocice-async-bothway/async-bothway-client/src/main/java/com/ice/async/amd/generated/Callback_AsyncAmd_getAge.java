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

public abstract class Callback_AsyncAmd_getAge
    extends IceInternal.TwowayCallback implements Ice.TwowayCallbackArg1<String>
{
    public final void __completed(Ice.AsyncResult __result)
    {
        AsyncAmdPrxHelper.__getAge_completed(this, __result);
    }
}