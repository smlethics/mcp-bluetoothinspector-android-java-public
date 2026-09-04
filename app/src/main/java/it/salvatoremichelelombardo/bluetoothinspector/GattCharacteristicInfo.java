package it.salvatoremichelelombardo.bluetoothinspector;
import java.util.*;
public final class GattCharacteristicInfo {
    public final String uuid,valueHex; public final int properties; public final List<String> descriptors;
    public GattCharacteristicInfo(String uuid,int properties,String valueHex,List<String> descriptors){ this.uuid=uuid; this.properties=properties; this.valueHex=valueHex; this.descriptors=descriptors; }
}
