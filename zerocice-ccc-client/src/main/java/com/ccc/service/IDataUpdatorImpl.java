package com.ccc.service;

import Ice.Current;
import hjmos.EntitiesDataService.LocatitionInfo;
import hjmos.EntitiesDataService._IDataUpdatorDisp;
import java.util.Map;
import java.util.logging.Logger;

/**
 * @author zyting
 * @sinne 2020-07-30
 */
public class IDataUpdatorImpl extends _IDataUpdatorDisp {

    public final static Logger log = Logger.getLogger(IDataUpdatorImpl.class.getSimpleName());

    @Override
    public int UpdateEntities(String cbId, String interfaceId, LocatitionInfo info, Map<String, String> data, Current __current) {

        log.info("监听到服务端返回的数据。。。。。");

        System.out.println(cbId +","+interfaceId+","+info.trainId+","+info.lineId+","+info.stationId);
        // 获取点位数据，遍历map
        for(Map.Entry<String, String> entry : data.entrySet()){
            System.out.println(entry.getKey() + ": "+entry.getValue());
        }

        return 0;
    }

}
