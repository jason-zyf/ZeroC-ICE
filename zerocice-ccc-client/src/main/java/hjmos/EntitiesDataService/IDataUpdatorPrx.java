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

public interface IDataUpdatorPrx extends Ice.ObjectPrx
{
    public int UpdateEntities(String cbId, String interfaceId, LocatitionInfo info, java.util.Map<java.lang.String, java.lang.String> data);

    public int UpdateEntities(String cbId, String interfaceId, LocatitionInfo info, java.util.Map<java.lang.String, java.lang.String> data, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_UpdateEntities(String cbId, String interfaceId, LocatitionInfo info, java.util.Map<java.lang.String, java.lang.String> data);

    public Ice.AsyncResult begin_UpdateEntities(String cbId, String interfaceId, LocatitionInfo info, java.util.Map<java.lang.String, java.lang.String> data, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_UpdateEntities(String cbId, String interfaceId, LocatitionInfo info, java.util.Map<java.lang.String, java.lang.String> data, Ice.Callback __cb);

    public Ice.AsyncResult begin_UpdateEntities(String cbId, String interfaceId, LocatitionInfo info, java.util.Map<java.lang.String, java.lang.String> data, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_UpdateEntities(String cbId, String interfaceId, LocatitionInfo info, java.util.Map<java.lang.String, java.lang.String> data, Callback_IDataUpdator_UpdateEntities __cb);

    public Ice.AsyncResult begin_UpdateEntities(String cbId, String interfaceId, LocatitionInfo info, java.util.Map<java.lang.String, java.lang.String> data, java.util.Map<String, String> __ctx, Callback_IDataUpdator_UpdateEntities __cb);

    public Ice.AsyncResult begin_UpdateEntities(String cbId, 
                                                String interfaceId, 
                                                LocatitionInfo info, 
                                                java.util.Map<java.lang.String, java.lang.String> data, 
                                                IceInternal.Functional_IntCallback __responseCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_UpdateEntities(String cbId, 
                                                String interfaceId, 
                                                LocatitionInfo info, 
                                                java.util.Map<java.lang.String, java.lang.String> data, 
                                                IceInternal.Functional_IntCallback __responseCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_UpdateEntities(String cbId, 
                                                String interfaceId, 
                                                LocatitionInfo info, 
                                                java.util.Map<java.lang.String, java.lang.String> data, 
                                                java.util.Map<String, String> __ctx, 
                                                IceInternal.Functional_IntCallback __responseCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_UpdateEntities(String cbId, 
                                                String interfaceId, 
                                                LocatitionInfo info, 
                                                java.util.Map<java.lang.String, java.lang.String> data, 
                                                java.util.Map<String, String> __ctx, 
                                                IceInternal.Functional_IntCallback __responseCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                IceInternal.Functional_BoolCallback __sentCb);

    public int end_UpdateEntities(Ice.AsyncResult __result);
}
