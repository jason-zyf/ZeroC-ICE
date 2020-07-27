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
// Generated from file `Hello.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.test.ice.service.generated;

/**
 * Provides type-specific helper functions.
 **/
public final class HelloPrxHelper extends Ice.ObjectPrxHelperBase implements HelloPrx
{
    private static final String __sayHello_name = "sayHello";

    public String sayHello(String s)
    {
        return sayHello(s, null, false);
    }

    public String sayHello(String s, java.util.Map<String, String> __ctx)
    {
        return sayHello(s, __ctx, true);
    }

    private String sayHello(String s, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__sayHello_name);
        return end_sayHello(begin_sayHello(s, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_sayHello(String s)
    {
        return begin_sayHello(s, null, false, false, null);
    }

    public Ice.AsyncResult begin_sayHello(String s, java.util.Map<String, String> __ctx)
    {
        return begin_sayHello(s, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_sayHello(String s, Ice.Callback __cb)
    {
        return begin_sayHello(s, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_sayHello(String s, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_sayHello(s, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_sayHello(String s, Callback_Hello_sayHello __cb)
    {
        return begin_sayHello(s, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_sayHello(String s, java.util.Map<String, String> __ctx, Callback_Hello_sayHello __cb)
    {
        return begin_sayHello(s, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_sayHello(String s, 
                                          IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_sayHello(s, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_sayHello(String s, 
                                          IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                          IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_sayHello(s, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_sayHello(String s, 
                                          java.util.Map<String, String> __ctx, 
                                          IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_sayHello(s, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_sayHello(String s, 
                                          java.util.Map<String, String> __ctx, 
                                          IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                          IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_sayHello(s, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_sayHello(String s, 
                                           java.util.Map<String, String> __ctx, 
                                           boolean __explicitCtx, 
                                           boolean __synchronous, 
                                           IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                           IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                           IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_sayHello(s, __ctx, __explicitCtx, __synchronous, 
                              new IceInternal.Functional_TwowayCallbackArg1<String>(__responseCb, __exceptionCb, __sentCb)
                                  {
                                      public final void __completed(Ice.AsyncResult __result)
                                      {
                                          HelloPrxHelper.__sayHello_completed(this, __result);
                                      }
                                  });
    }

    private Ice.AsyncResult begin_sayHello(String s, 
                                           java.util.Map<String, String> __ctx, 
                                           boolean __explicitCtx, 
                                           boolean __synchronous, 
                                           IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__sayHello_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__sayHello_name, __cb);
        try
        {
            __result.prepare(__sayHello_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(s);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public String end_sayHello(Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __sayHello_name);
        try
        {
            if(!__result.__wait())
            {
                try
                {
                    __result.throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.startReadParams();
            String __ret;
            __ret = __is.readString();
            __result.endReadParams();
            return __ret;
        }
        finally
        {
            if(__result != null)
            {
                __result.cacheMessageBuffers();
            }
        }
    }

    static public void __sayHello_completed(Ice.TwowayCallbackArg1<String> __cb, Ice.AsyncResult __result)
    {
        HelloPrx __proxy = (HelloPrx)__result.getProxy();
        String __ret = null;
        try
        {
            __ret = __proxy.end_sayHello(__result);
        }
        catch(Ice.LocalException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        catch(Ice.SystemException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        __cb.response(__ret);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static HelloPrx checkedCast(Ice.ObjectPrx __obj)
    {
        return checkedCastImpl(__obj, ice_staticId(), HelloPrx.class, HelloPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static HelloPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __ctx, ice_staticId(), HelloPrx.class, HelloPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static HelloPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return checkedCastImpl(__obj, __facet, ice_staticId(), HelloPrx.class, HelloPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static HelloPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __facet, __ctx, ice_staticId(), HelloPrx.class, HelloPrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @return A proxy for this type.
     **/
    public static HelloPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        return uncheckedCastImpl(__obj, HelloPrx.class, HelloPrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    public static HelloPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return uncheckedCastImpl(__obj, __facet, HelloPrx.class, HelloPrxHelper.class);
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::generated::Hello"
    };

    /**
     * Provides the Slice type ID of this type.
     * @return The Slice type ID.
     **/
    public static String ice_staticId()
    {
        return __ids[1];
    }

    public static void __write(IceInternal.BasicStream __os, HelloPrx v)
    {
        __os.writeProxy(v);
    }

    public static HelloPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            HelloPrxHelper result = new HelloPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}
