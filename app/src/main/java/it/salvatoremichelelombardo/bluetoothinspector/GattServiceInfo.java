package it.salvatoremichelelombardo.bluetoothinspector;
import java.util.*;
public final class GattServiceInfo {
    public final String uuid; public final List<GattCharacteristicInfo> characteristics;
    public GattServiceInfo(String uuid,List<GattCharacteristicInfo> characteristics){ this.uuid=uuid; this.characteristics=characteristics; }
}
