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
 * 客户端处理服务端返回
 **/

public abstract class Callback_IServerCallBack_response
    extends IceInternal.TwowayCallback implements Ice.TwowayCallbackBool
{
    public final void __completed(Ice.AsyncResult __result)
    {
        IServerCallBackPrxHelper.__response_completed(this, __result);
    }
}
