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
// Generated from file `AsyncAmi.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.ice.async.ami.generated;

public final class AsyncAmiHolder extends Ice.ObjectHolderBase<AsyncAmi>
{
    public
    AsyncAmiHolder()
    {
    }

    public
    AsyncAmiHolder(AsyncAmi value)
    {
        this.value = value;
    }

    public void
    patch(Ice.Object v)
    {
        if(v == null || v instanceof AsyncAmi)
        {
            value = (AsyncAmi)v;
        }
        else
        {
            IceInternal.Ex.throwUOE(type(), v);
        }
    }

    public String
    type()
    {
        return _AsyncAmiDisp.ice_staticId();
    }
}