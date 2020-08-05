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

public final class IServerCallBackHolder extends Ice.ObjectHolderBase<IServerCallBack>
{
    public
    IServerCallBackHolder()
    {
    }

    public
    IServerCallBackHolder(IServerCallBack value)
    {
        this.value = value;
    }

    public void
    patch(Ice.Object v)
    {
        if(v == null || v instanceof IServerCallBack)
        {
            value = (IServerCallBack)v;
        }
        else
        {
            IceInternal.Ex.throwUOE(type(), v);
        }
    }

    public String
    type()
    {
        return _IServerCallBackDisp.ice_staticId();
    }
}
