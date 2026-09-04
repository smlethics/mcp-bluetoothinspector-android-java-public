package it.salvatoremichelelombardo.bluetoothinspector;

import android.Manifest;
import java.util.*;

public final class BluetoothPermissionManager {
    private BluetoothPermissionManager() {}
    public static List<String> requiredRuntimePermissions(int sdk) {
        if (sdk >= 31) return Arrays.asList(Manifest.permission.BLUETOOTH_SCAN, Manifest.permission.BLUETOOTH_CONNECT);
        return Collections.singletonList(Manifest.permission.ACCESS_FINE_LOCATION);
    }
}
