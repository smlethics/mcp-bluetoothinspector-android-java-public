# SML Bluetooth Inspector for Android — Public Specifications

## 1. Scope

Standalone public read-only Android application written in Java for inspecting Bluetooth Classic and BLE metadata legitimately exposed by Android and by the selected remote device.

This specification is derived only from material already public in this repository.

## 2. Supported discovery

- bonded Bluetooth Classic devices;
- discoverable Classic devices;
- BLE advertisements;
- RSSI;
- service UUIDs;
- manufacturer data;
- service data;
- user-selected GATT inspection.

## 3. GATT inspection

The application may enumerate:

- services;
- characteristics;
- descriptors.

Characteristic reads are permitted only when the remote characteristic exposes `PROPERTY_READ`.

The baseline is read-only: GATT writes are outside scope.

## 4. Safety boundary

The application must not:

- bypass pairing or authentication;
- extract credentials;
- brute-force access;
- exploit remote devices;
- write GATT values;
- modify firmware;
- claim access to metadata Android/device APIs do not expose.

Use is limited to devices the operator owns or is explicitly authorized to inspect.

## 5. Reporting

The application may produce/share a JSON snapshot containing the metadata collected during the authorized inspection.

Reports must not fabricate unavailable fields.

## 6. Repository hygiene

The public repository must remain standalone and must not contain:

- private dashboard/infrastructure integration;
- local machine paths;
- credentials or tokens;
- private configuration;
- local SDK settings;
- unrelated private project data.

## 7. Build criteria

Publicly documented baseline:

- JDK 17;
- Android SDK 36;
- Gradle 9.6;
- `gradle testDebugUnitTest assembleDebug`.

## 8. Completion criteria

1. unit tests pass;
2. debug APK builds;
3. Classic/BLE discovery works on authorized devices;
4. GATT reads occur only on readable characteristics;
5. JSON report sharing works;
6. no write/bypass/exploit capability is introduced;
7. repository remains free of private/internal data.

## 9. Documentation source

The public README and public source tree are authoritative. No private SML chat/project data is used by this specification.
