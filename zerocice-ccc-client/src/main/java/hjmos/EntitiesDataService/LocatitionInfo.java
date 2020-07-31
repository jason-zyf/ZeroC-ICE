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

public class LocatitionInfo implements java.lang.Cloneable, java.io.Serializable
{
    public int lineId;

    public int stationId;

    public String trainId;

    public LocatitionInfo()
    {
        trainId = "";
    }

    public LocatitionInfo(int lineId, int stationId, String trainId)
    {
        this.lineId = lineId;
        this.stationId = stationId;
        this.trainId = trainId;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        LocatitionInfo _r = null;
        if(rhs instanceof LocatitionInfo)
        {
            _r = (LocatitionInfo)rhs;
        }

        if(_r != null)
        {
            if(lineId != _r.lineId)
            {
                return false;
            }
            if(stationId != _r.stationId)
            {
                return false;
            }
            if(trainId != _r.trainId)
            {
                if(trainId == null || _r.trainId == null || !trainId.equals(_r.trainId))
                {
                    return false;
                }
            }

            return true;
        }

        return false;
    }

    public int
    hashCode()
    {
        int __h = 5381;
        __h = IceInternal.HashUtil.hashAdd(__h, "::hjmos::EntitiesDataService::LocatitionInfo");
        __h = IceInternal.HashUtil.hashAdd(__h, lineId);
        __h = IceInternal.HashUtil.hashAdd(__h, stationId);
        __h = IceInternal.HashUtil.hashAdd(__h, trainId);
        return __h;
    }

    public LocatitionInfo
    clone()
    {
        LocatitionInfo c = null;
        try
        {
            c = (LocatitionInfo)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void
    __write(IceInternal.BasicStream __os)
    {
        __os.writeInt(lineId);
        __os.writeInt(stationId);
        __os.writeString(trainId);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        lineId = __is.readInt();
        stationId = __is.readInt();
        trainId = __is.readString();
    }

    static public void
    __write(IceInternal.BasicStream __os, LocatitionInfo __v)
    {
        if(__v == null)
        {
            __nullMarshalValue.__write(__os);
        }
        else
        {
            __v.__write(__os);
        }
    }

    static public LocatitionInfo
    __read(IceInternal.BasicStream __is, LocatitionInfo __v)
    {
        if(__v == null)
        {
             __v = new LocatitionInfo();
        }
        __v.__read(__is);
        return __v;
    }
    
    private static final LocatitionInfo __nullMarshalValue = new LocatitionInfo();

    public static final long serialVersionUID = -1236617064L;
}
