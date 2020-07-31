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
// Generated from file `entities_data_service.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package hjmos.EntitiesDataService;

/**
 * Provides type-specific helper functions.
 **/
public final class IDataServiceAccessorPrxHelper extends Ice.ObjectPrxHelperBase implements IDataServiceAccessorPrx
{
    private static final String __QueryEntitiesValue_name = "QueryEntitiesValue";

    public void QueryEntitiesValue(String cbId, String interfaceId, LocatitionInfo info, String[] entitiesArray)
    {
        QueryEntitiesValue(cbId, interfaceId, info, entitiesArray, null, false);
    }

    public void QueryEntitiesValue(String cbId, String interfaceId, LocatitionInfo info, String[] entitiesArray, java.util.Map<String, String> __ctx)
    {
        QueryEntitiesValue(cbId, interfaceId, info, entitiesArray, __ctx, true);
    }

    private void QueryEntitiesValue(String cbId, String interfaceId, LocatitionInfo info, String[] entitiesArray, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        end_QueryEntitiesValue(begin_QueryEntitiesValue(cbId, interfaceId, info, entitiesArray, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_QueryEntitiesValue(String cbId, String interfaceId, LocatitionInfo info, String[] entitiesArray)
    {
        return begin_QueryEntitiesValue(cbId, interfaceId, info, entitiesArray, null, false, false, null);
    }

    public Ice.AsyncResult begin_QueryEntitiesValue(String cbId, String interfaceId, LocatitionInfo info, String[] entitiesArray, java.util.Map<String, String> __ctx)
    {
        return begin_QueryEntitiesValue(cbId, interfaceId, info, entitiesArray, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_QueryEntitiesValue(String cbId, String interfaceId, LocatitionInfo info, String[] entitiesArray, Ice.Callback __cb)
    {
        return begin_QueryEntitiesValue(cbId, interfaceId, info, entitiesArray, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_QueryEntitiesValue(String cbId, String interfaceId, LocatitionInfo info, String[] entitiesArray, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_QueryEntitiesValue(cbId, interfaceId, info, entitiesArray, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_QueryEntitiesValue(String cbId, String interfaceId, LocatitionInfo info, String[] entitiesArray, Callback_IDataServiceAccessor_QueryEntitiesValue __cb)
    {
        return begin_QueryEntitiesValue(cbId, interfaceId, info, entitiesArray, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_QueryEntitiesValue(String cbId, String interfaceId, LocatitionInfo info, String[] entitiesArray, java.util.Map<String, String> __ctx, Callback_IDataServiceAccessor_QueryEntitiesValue __cb)
    {
        return begin_QueryEntitiesValue(cbId, interfaceId, info, entitiesArray, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_QueryEntitiesValue(String cbId, 
                                                    String interfaceId, 
                                                    LocatitionInfo info, 
                                                    String[] entitiesArray, 
                                                    IceInternal.Functional_VoidCallback __responseCb, 
                                                    IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_QueryEntitiesValue(cbId, interfaceId, info, entitiesArray, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_QueryEntitiesValue(String cbId, 
                                                    String interfaceId, 
                                                    LocatitionInfo info, 
                                                    String[] entitiesArray, 
                                                    IceInternal.Functional_VoidCallback __responseCb, 
                                                    IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                    IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_QueryEntitiesValue(cbId, interfaceId, info, entitiesArray, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_QueryEntitiesValue(String cbId, 
                                                    String interfaceId, 
                                                    LocatitionInfo info, 
                                                    String[] entitiesArray, 
                                                    java.util.Map<String, String> __ctx, 
                                                    IceInternal.Functional_VoidCallback __responseCb, 
                                                    IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_QueryEntitiesValue(cbId, interfaceId, info, entitiesArray, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_QueryEntitiesValue(String cbId, 
                                                    String interfaceId, 
                                                    LocatitionInfo info, 
                                                    String[] entitiesArray, 
                                                    java.util.Map<String, String> __ctx, 
                                                    IceInternal.Functional_VoidCallback __responseCb, 
                                                    IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                    IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_QueryEntitiesValue(cbId, interfaceId, info, entitiesArray, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_QueryEntitiesValue(String cbId, 
                                                     String interfaceId, 
                                                     LocatitionInfo info, 
                                                     String[] entitiesArray, 
                                                     java.util.Map<String, String> __ctx, 
                                                     boolean __explicitCtx, 
                                                     boolean __synchronous, 
                                                     IceInternal.Functional_VoidCallback __responseCb, 
                                                     IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                     IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_QueryEntitiesValue(cbId, 
                                        interfaceId, 
                                        info, 
                                        entitiesArray, 
                                        __ctx, 
                                        __explicitCtx, 
                                        __synchronous, 
                                        new IceInternal.Functional_OnewayCallback(__responseCb, __exceptionCb, __sentCb));
    }

    private Ice.AsyncResult begin_QueryEntitiesValue(String cbId, 
                                                     String interfaceId, 
                                                     LocatitionInfo info, 
                                                     String[] entitiesArray, 
                                                     java.util.Map<String, String> __ctx, 
                                                     boolean __explicitCtx, 
                                                     boolean __synchronous, 
                                                     IceInternal.CallbackBase __cb)
    {
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__QueryEntitiesValue_name, __cb);
        try
        {
            __result.prepare(__QueryEntitiesValue_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(cbId);
            __os.writeString(interfaceId);
            LocatitionInfo.__write(__os, info);
            EntitiesArrayHelper.write(__os, entitiesArray);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public void end_QueryEntitiesValue(Ice.AsyncResult __iresult)
    {
        __end(__iresult, __QueryEntitiesValue_name);
    }

    private static final String __Register_name = "Register";

    public String Register(IDataUpdatorPrx cb)
    {
        return Register(cb, null, false);
    }

    public String Register(IDataUpdatorPrx cb, java.util.Map<String, String> __ctx)
    {
        return Register(cb, __ctx, true);
    }

    private String Register(IDataUpdatorPrx cb, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__Register_name);
        return end_Register(begin_Register(cb, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_Register(IDataUpdatorPrx cb)
    {
        return begin_Register(cb, null, false, false, null);
    }

    public Ice.AsyncResult begin_Register(IDataUpdatorPrx cb, java.util.Map<String, String> __ctx)
    {
        return begin_Register(cb, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_Register(IDataUpdatorPrx cb, Ice.Callback __cb)
    {
        return begin_Register(cb, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_Register(IDataUpdatorPrx cb, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_Register(cb, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_Register(IDataUpdatorPrx cb, Callback_IDataServiceAccessor_Register __cb)
    {
        return begin_Register(cb, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_Register(IDataUpdatorPrx cb, java.util.Map<String, String> __ctx, Callback_IDataServiceAccessor_Register __cb)
    {
        return begin_Register(cb, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_Register(IDataUpdatorPrx cb, 
                                          IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_Register(cb, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_Register(IDataUpdatorPrx cb, 
                                          IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                          IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_Register(cb, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_Register(IDataUpdatorPrx cb, 
                                          java.util.Map<String, String> __ctx, 
                                          IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_Register(cb, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_Register(IDataUpdatorPrx cb, 
                                          java.util.Map<String, String> __ctx, 
                                          IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                          IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_Register(cb, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_Register(IDataUpdatorPrx cb, 
                                           java.util.Map<String, String> __ctx, 
                                           boolean __explicitCtx, 
                                           boolean __synchronous, 
                                           IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                           IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                           IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_Register(cb, __ctx, __explicitCtx, __synchronous, 
                              new IceInternal.Functional_TwowayCallbackArg1<String>(__responseCb, __exceptionCb, __sentCb)
                                  {
                                      public final void __completed(Ice.AsyncResult __result)
                                      {
                                          IDataServiceAccessorPrxHelper.__Register_completed(this, __result);
                                      }
                                  });
    }

    private Ice.AsyncResult begin_Register(IDataUpdatorPrx cb, 
                                           java.util.Map<String, String> __ctx, 
                                           boolean __explicitCtx, 
                                           boolean __synchronous, 
                                           IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__Register_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__Register_name, __cb);
        try
        {
            __result.prepare(__Register_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            IDataUpdatorPrxHelper.__write(__os, cb);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public String end_Register(Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __Register_name);
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

    static public void __Register_completed(Ice.TwowayCallbackArg1<String> __cb, Ice.AsyncResult __result)
    {
        hjmos.EntitiesDataService.IDataServiceAccessorPrx __proxy = (hjmos.EntitiesDataService.IDataServiceAccessorPrx)__result.getProxy();
        String __ret = null;
        try
        {
            __ret = __proxy.end_Register(__result);
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

    private static final String __UnSubscribe_name = "UnSubscribe";

    public boolean UnSubscribe(String cbId)
    {
        return UnSubscribe(cbId, null, false);
    }

    public boolean UnSubscribe(String cbId, java.util.Map<String, String> __ctx)
    {
        return UnSubscribe(cbId, __ctx, true);
    }

    private boolean UnSubscribe(String cbId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__UnSubscribe_name);
        return end_UnSubscribe(begin_UnSubscribe(cbId, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_UnSubscribe(String cbId)
    {
        return begin_UnSubscribe(cbId, null, false, false, null);
    }

    public Ice.AsyncResult begin_UnSubscribe(String cbId, java.util.Map<String, String> __ctx)
    {
        return begin_UnSubscribe(cbId, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_UnSubscribe(String cbId, Ice.Callback __cb)
    {
        return begin_UnSubscribe(cbId, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_UnSubscribe(String cbId, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_UnSubscribe(cbId, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_UnSubscribe(String cbId, Callback_IDataServiceAccessor_UnSubscribe __cb)
    {
        return begin_UnSubscribe(cbId, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_UnSubscribe(String cbId, java.util.Map<String, String> __ctx, Callback_IDataServiceAccessor_UnSubscribe __cb)
    {
        return begin_UnSubscribe(cbId, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_UnSubscribe(String cbId, 
                                             IceInternal.Functional_BoolCallback __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_UnSubscribe(cbId, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_UnSubscribe(String cbId, 
                                             IceInternal.Functional_BoolCallback __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                             IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_UnSubscribe(cbId, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_UnSubscribe(String cbId, 
                                             java.util.Map<String, String> __ctx, 
                                             IceInternal.Functional_BoolCallback __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_UnSubscribe(cbId, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_UnSubscribe(String cbId, 
                                             java.util.Map<String, String> __ctx, 
                                             IceInternal.Functional_BoolCallback __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                             IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_UnSubscribe(cbId, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_UnSubscribe(String cbId, 
                                              java.util.Map<String, String> __ctx, 
                                              boolean __explicitCtx, 
                                              boolean __synchronous, 
                                              IceInternal.Functional_BoolCallback __responseCb, 
                                              IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                              IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_UnSubscribe(cbId, __ctx, __explicitCtx, __synchronous, 
                                 new IceInternal.Functional_TwowayCallbackBool(__responseCb, __exceptionCb, __sentCb)
                                     {
                                         public final void __completed(Ice.AsyncResult __result)
                                         {
                                             IDataServiceAccessorPrxHelper.__UnSubscribe_completed(this, __result);
                                         }
                                     });
    }

    private Ice.AsyncResult begin_UnSubscribe(String cbId, 
                                              java.util.Map<String, String> __ctx, 
                                              boolean __explicitCtx, 
                                              boolean __synchronous, 
                                              IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__UnSubscribe_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__UnSubscribe_name, __cb);
        try
        {
            __result.prepare(__UnSubscribe_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(cbId);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public boolean end_UnSubscribe(Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __UnSubscribe_name);
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
            boolean __ret;
            __ret = __is.readBool();
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

    static public void __UnSubscribe_completed(Ice.TwowayCallbackBool __cb, Ice.AsyncResult __result)
    {
        hjmos.EntitiesDataService.IDataServiceAccessorPrx __proxy = (hjmos.EntitiesDataService.IDataServiceAccessorPrx)__result.getProxy();
        boolean __ret = false;
        try
        {
            __ret = __proxy.end_UnSubscribe(__result);
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

    private static final String __UnSubscribeImpl_name = "UnSubscribeImpl";

    public boolean UnSubscribeImpl(String cbId, String interfaceId)
    {
        return UnSubscribeImpl(cbId, interfaceId, null, false);
    }

    public boolean UnSubscribeImpl(String cbId, String interfaceId, java.util.Map<String, String> __ctx)
    {
        return UnSubscribeImpl(cbId, interfaceId, __ctx, true);
    }

    private boolean UnSubscribeImpl(String cbId, String interfaceId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__UnSubscribeImpl_name);
        return end_UnSubscribeImpl(begin_UnSubscribeImpl(cbId, interfaceId, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_UnSubscribeImpl(String cbId, String interfaceId)
    {
        return begin_UnSubscribeImpl(cbId, interfaceId, null, false, false, null);
    }

    public Ice.AsyncResult begin_UnSubscribeImpl(String cbId, String interfaceId, java.util.Map<String, String> __ctx)
    {
        return begin_UnSubscribeImpl(cbId, interfaceId, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_UnSubscribeImpl(String cbId, String interfaceId, Ice.Callback __cb)
    {
        return begin_UnSubscribeImpl(cbId, interfaceId, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_UnSubscribeImpl(String cbId, String interfaceId, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_UnSubscribeImpl(cbId, interfaceId, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_UnSubscribeImpl(String cbId, String interfaceId, Callback_IDataServiceAccessor_UnSubscribeImpl __cb)
    {
        return begin_UnSubscribeImpl(cbId, interfaceId, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_UnSubscribeImpl(String cbId, String interfaceId, java.util.Map<String, String> __ctx, Callback_IDataServiceAccessor_UnSubscribeImpl __cb)
    {
        return begin_UnSubscribeImpl(cbId, interfaceId, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_UnSubscribeImpl(String cbId, 
                                                 String interfaceId, 
                                                 IceInternal.Functional_BoolCallback __responseCb, 
                                                 IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_UnSubscribeImpl(cbId, interfaceId, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_UnSubscribeImpl(String cbId, 
                                                 String interfaceId, 
                                                 IceInternal.Functional_BoolCallback __responseCb, 
                                                 IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                 IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_UnSubscribeImpl(cbId, interfaceId, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_UnSubscribeImpl(String cbId, 
                                                 String interfaceId, 
                                                 java.util.Map<String, String> __ctx, 
                                                 IceInternal.Functional_BoolCallback __responseCb, 
                                                 IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_UnSubscribeImpl(cbId, interfaceId, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_UnSubscribeImpl(String cbId, 
                                                 String interfaceId, 
                                                 java.util.Map<String, String> __ctx, 
                                                 IceInternal.Functional_BoolCallback __responseCb, 
                                                 IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                 IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_UnSubscribeImpl(cbId, interfaceId, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_UnSubscribeImpl(String cbId, 
                                                  String interfaceId, 
                                                  java.util.Map<String, String> __ctx, 
                                                  boolean __explicitCtx, 
                                                  boolean __synchronous, 
                                                  IceInternal.Functional_BoolCallback __responseCb, 
                                                  IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                  IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_UnSubscribeImpl(cbId, interfaceId, __ctx, __explicitCtx, __synchronous, 
                                     new IceInternal.Functional_TwowayCallbackBool(__responseCb, __exceptionCb, __sentCb)
                                         {
                                             public final void __completed(Ice.AsyncResult __result)
                                             {
                                                 IDataServiceAccessorPrxHelper.__UnSubscribeImpl_completed(this, __result);
                                             }
                                         });
    }

    private Ice.AsyncResult begin_UnSubscribeImpl(String cbId, 
                                                  String interfaceId, 
                                                  java.util.Map<String, String> __ctx, 
                                                  boolean __explicitCtx, 
                                                  boolean __synchronous, 
                                                  IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__UnSubscribeImpl_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__UnSubscribeImpl_name, __cb);
        try
        {
            __result.prepare(__UnSubscribeImpl_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(cbId);
            __os.writeString(interfaceId);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public boolean end_UnSubscribeImpl(Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __UnSubscribeImpl_name);
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
            boolean __ret;
            __ret = __is.readBool();
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

    static public void __UnSubscribeImpl_completed(Ice.TwowayCallbackBool __cb, Ice.AsyncResult __result)
    {
        hjmos.EntitiesDataService.IDataServiceAccessorPrx __proxy = (hjmos.EntitiesDataService.IDataServiceAccessorPrx)__result.getProxy();
        boolean __ret = false;
        try
        {
            __ret = __proxy.end_UnSubscribeImpl(__result);
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
    public static IDataServiceAccessorPrx checkedCast(Ice.ObjectPrx __obj)
    {
        return checkedCastImpl(__obj, ice_staticId(), IDataServiceAccessorPrx.class, IDataServiceAccessorPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static IDataServiceAccessorPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __ctx, ice_staticId(), IDataServiceAccessorPrx.class, IDataServiceAccessorPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static IDataServiceAccessorPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return checkedCastImpl(__obj, __facet, ice_staticId(), IDataServiceAccessorPrx.class, IDataServiceAccessorPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static IDataServiceAccessorPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __facet, __ctx, ice_staticId(), IDataServiceAccessorPrx.class, IDataServiceAccessorPrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @return A proxy for this type.
     **/
    public static IDataServiceAccessorPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        return uncheckedCastImpl(__obj, IDataServiceAccessorPrx.class, IDataServiceAccessorPrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    public static IDataServiceAccessorPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return uncheckedCastImpl(__obj, __facet, IDataServiceAccessorPrx.class, IDataServiceAccessorPrxHelper.class);
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::hjmos::EntitiesDataService::IDataServiceAccessor"
    };

    /**
     * Provides the Slice type ID of this type.
     * @return The Slice type ID.
     **/
    public static String ice_staticId()
    {
        return __ids[1];
    }

    public static void __write(IceInternal.BasicStream __os, IDataServiceAccessorPrx v)
    {
        __os.writeProxy(v);
    }

    public static IDataServiceAccessorPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            IDataServiceAccessorPrxHelper result = new IDataServiceAccessorPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}
