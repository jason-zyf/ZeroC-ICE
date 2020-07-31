module hjmos
{
        module EntitiesDataService
    	{
	    dictionary<string, string> EntitiesValueMap;
	    sequence<string> EntitiesArray;
	    struct LocatitionInfo{
	    int lineId;
	    int stationId;	
	    string trainId;
	};

	interface IDataUpdator
	{
	    ["ami"] int UpdateEntities(string cbId, string interfaceId, LocatitionInfo info, EntitiesValueMap data);
	};

        interface IDataServiceAccessor
        {
			//订阅车辆详细信息 N12
            ["amd"] string Register(IDataUpdator* cb);			

	    //取消订阅
	    ["amd"] bool UnSubscribe(string cbId);
			
	    ["amd"] bool UnSubscribeImpl(string cbId, string interfaceId);
			
	    void QueryEntitiesValue(string cbId, string interfaceId, LocatitionInfo info, EntitiesArray entitiesArray);
        };
	};
};


