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

public interface _IDataServiceAccessorOperationsNC
{
    void Register_async(AMD_IDataServiceAccessor_Register __cb, IDataUpdatorPrx cb);

    void UnSubscribe_async(AMD_IDataServiceAccessor_UnSubscribe __cb, String cbId);

    void UnSubscribeImpl_async(AMD_IDataServiceAccessor_UnSubscribeImpl __cb, String cbId, String interfaceId);

    void QueryEntitiesValue(String cbId, String interfaceId, LocatitionInfo info, String[] entitiesArray);
}
