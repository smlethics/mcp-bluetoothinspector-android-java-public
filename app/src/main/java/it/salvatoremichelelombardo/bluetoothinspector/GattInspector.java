package it.salvatoremichelelombardo.bluetoothinspector;

import android.bluetooth.*; import android.content.Context; import java.util.*;

public final class GattInspector {
    public interface Listener { void onComplete(List<GattServiceInfo> services); void onError(String message); }
    private final Context context;
    public GattInspector(Context context){ this.context=context; }
    public void inspect(BluetoothDevice device, Listener listener){
        try { device.connectGatt(context,false,new BluetoothGattCallback(){
            private final List<BluetoothGattCharacteristic> readable=new ArrayList<>(); private int index=0;
            @Override public void onConnectionStateChange(BluetoothGatt g,int status,int newState){ if(status!=BluetoothGatt.GATT_SUCCESS){ listener.onError("GATT status "+status); g.close(); return;} if(newState==BluetoothProfile.STATE_CONNECTED) g.discoverServices(); else if(newState==BluetoothProfile.STATE_DISCONNECTED) g.close(); }
            @Override public void onServicesDiscovered(BluetoothGatt g,int status){ if(status!=BluetoothGatt.GATT_SUCCESS){listener.onError("Service discovery "+status);g.close();return;} for(BluetoothGattService s:g.getServices()) for(BluetoothGattCharacteristic c:s.getCharacteristics()) if((c.getProperties()&BluetoothGattCharacteristic.PROPERTY_READ)!=0) readable.add(c); if(readable.isEmpty()){finish(g);return;} if(!g.readCharacteristic(readable.get(0))) finish(g); }
            @Override public void onCharacteristicRead(BluetoothGatt g,BluetoothGattCharacteristic c,int status){ index++; if(index<readable.size()){ if(!g.readCharacteristic(readable.get(index))) finish(g); } else finish(g); }
            private void finish(BluetoothGatt g){ List<GattServiceInfo> out=new ArrayList<>(); for(BluetoothGattService s:g.getServices()){ List<GattCharacteristicInfo> cs=new ArrayList<>(); for(BluetoothGattCharacteristic c:s.getCharacteristics()){ List<String> ds=new ArrayList<>(); for(BluetoothGattDescriptor d:c.getDescriptors()) ds.add(d.getUuid().toString()); cs.add(new GattCharacteristicInfo(c.getUuid().toString(),c.getProperties(),hex(c.getValue()),ds)); } out.add(new GattServiceInfo(s.getUuid().toString(),cs)); } listener.onComplete(out); g.disconnect(); g.close(); }
        }); } catch(SecurityException e){ listener.onError("Permesso Bluetooth negato"); }
    }
    static String hex(byte[] b){ if(b==null)return ""; StringBuilder s=new StringBuilder(); for(byte x:b)s.append(String.format(Locale.ROOT,"%02X",x)); return s.toString(); }
}
