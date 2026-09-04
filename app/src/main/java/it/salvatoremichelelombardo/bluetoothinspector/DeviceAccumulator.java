package it.salvatoremichelelombardo.bluetoothinspector;
import java.util.*;
public final class DeviceAccumulator {
    private final LinkedHashMap<String,DeviceInfo> devices=new LinkedHashMap<>();
    public synchronized void upsert(DeviceInfo d){ String key=d.getAddress().isEmpty()?d.getTransport()+"|"+d.getName():d.getAddress(); devices.put(key,d); }
    public synchronized List<DeviceInfo> snapshot(){ return new ArrayList<>(devices.values()); }
    public synchronized void clear(){ devices.clear(); }
}
