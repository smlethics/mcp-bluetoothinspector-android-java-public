# Architecture

## Scope

This repository is a standalone public Android Java Bluetooth inspector. It is intentionally independent from private dashboards, infrastructure and repositories.

## Components

- `MainActivity` — Android UI and inspection flow.
- `AndroidBluetoothScanner` — Bluetooth Classic/BLE discovery logic.
- `BluetoothPermissionManager` — Android runtime permission handling.
- `DeviceAccumulator` / `DeviceInfo` — normalized discovered-device state.
- `GattInspector` — read-only discovery of GATT services and characteristic metadata.
- `GattServiceInfo` / `GattCharacteristicInfo` — GATT metadata models.
- `DeviceReportJson` — local JSON representation/export of collected information.

## Safety model

The public edition is inspection-oriented and read-only. It does not provide arbitrary GATT writes, device exploitation, authentication bypasses or private remote-control integrations.

## Data flow

Android Bluetooth stack → discovery/scanning → device metadata → optional GATT service discovery → on-device UI/report.

No private backend is required by this public edition.

## Configuration

Do not commit SDK paths, signing material, API credentials, `.env` files or private configuration. Common sensitive/local artifacts are excluded by `.gitignore`.
