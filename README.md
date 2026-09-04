# SML Bluetooth Inspector for Android

Public, standalone read-only Android Bluetooth Classic/BLE inspector written in Java. It builds an installable debug APK and displays only metadata that Android and the remote device legitimately expose.

## Features
- Bonded and discoverable Bluetooth Classic devices.
- BLE advertisements with RSSI, service UUIDs, manufacturer and service data.
- User-selected GATT inspection: services, characteristics and descriptors.
- Characteristic reads only when `PROPERTY_READ` is exposed.
- JSON report sharing through Android's share sheet.

## Safety
Use only with devices you own or are explicitly authorized to inspect. The app does not bypass pairing/authentication, extract credentials, exploit devices, brute-force access, write GATT values or modify firmware.

## Build
Requires JDK 17, Android SDK 36 and Gradle 9.6. Run `gradle testDebugUnitTest assembleDebug`. APK: `app/build/outputs/apk/debug/app-debug.apk`.

## Public-source hygiene
This repository is intentionally standalone. It contains no private dashboard integration, local machine paths, credentials, tokens or private infrastructure configuration. Local Android SDK settings and any local secrets must remain outside version control.

Copyright © 2026 Salvatore Michele Lombardo. Released under the MIT License.
