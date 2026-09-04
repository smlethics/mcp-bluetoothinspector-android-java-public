# Build and use

## Requirements

- Android Studio with a current Android SDK
- JDK compatible with the project's Gradle/Android Gradle Plugin versions
- Android device with Bluetooth Classic and/or BLE support

## Build

1. Clone the repository.
2. Open it in Android Studio.
3. Synchronize Gradle dependencies.
4. Build the `debug` variant or run it on a physical Android device.

GitHub Actions runs unit tests and builds the debug application on repository changes.

## Use

1. Start the application on Android.
2. Grant the Bluetooth permissions requested by the operating system.
3. Start discovery/scanning.
4. Select a device you own or are authorized to inspect.
5. Review the available public Bluetooth/GATT metadata exposed to the Android application.

## Privacy

The standalone public edition does not require the author's private services, dashboards, repositories or credentials.

## Important

Bluetooth devices expose different information depending on protocol, Android version, pairing state and device permissions. Inspect only devices you own or are authorized to test.
