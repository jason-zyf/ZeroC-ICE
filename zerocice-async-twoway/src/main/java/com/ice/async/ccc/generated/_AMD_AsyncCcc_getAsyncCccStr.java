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

final class _AMD_AsyncCcc_getAsyncCccStr extends IceInternal.IncomingAsync implements AMD_AsyncCcc_getAsyncCccStr
{
    public _AMD_AsyncCcc_getAsyncCccStr(IceInternal.Incoming in)
    {
        super(in);
    }

    public void ice_response(String __ret)
    {
        if(__validateResponse(true))
        {
            try
            {
                IceInternal.BasicStream __os = this.__startWriteParams(Ice.FormatType.DefaultFormat);
                __os.writeString(__ret);
                this.__endWriteParams(true);
            }
            catch(Ice.LocalException __ex)
            {
                __exception(__ex);
                return;
            }
            __response();
        }
    }
}