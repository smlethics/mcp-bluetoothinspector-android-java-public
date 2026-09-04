package it.salvatoremichelelombardo.bluetoothinspector;

import java.util.*;

public final class DeviceInfo {
    private final String name,address,transport,manufacturerData,serviceData;
    private final int rssi,bondState,deviceType,majorClass;
    private final List<String> uuids;
    public DeviceInfo(String name,String address,int rssi,int bondState,List<String> uuids){ this(name,address,rssi,bondState,uuids,"unknown",0,0,"",""); }
    public DeviceInfo(String name,String address,int rssi,int bondState,List<String> uuids,String transport,int deviceType,int majorClass,String manufacturerData,String serviceData){
        this.name=name==null?"":name; this.address=address==null?"":address; this.rssi=rssi; this.bondState=bondState;
        this.uuids=Collections.unmodifiableList(new ArrayList<>(uuids==null?Collections.emptyList():uuids)); this.transport=transport==null?"unknown":transport;
        this.deviceType=deviceType; this.majorClass=majorClass; this.manufacturerData=manufacturerData==null?"":manufacturerData; this.serviceData=serviceData==null?"":serviceData;
    }
    public String getName(){return name;} public String getAddress(){return address;} public int getRssi(){return rssi;} public int getBondState(){return bondState;}
    public List<String> getUuids(){return uuids;} public String getTransport(){return transport;} public int getDeviceType(){return deviceType;} public int getMajorClass(){return majorClass;}
    public String getManufacturerData(){return manufacturerData;} public String getServiceData(){return serviceData;}
    public String display(){ return (name.isEmpty()?"(senza nome)":name)+"\n"+address+"  "+transport+"  RSSI "+rssi; }
}
