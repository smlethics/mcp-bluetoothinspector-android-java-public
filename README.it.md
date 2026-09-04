# SML Bluetooth Inspector per Android

Applicazione Android Java pubblica e autonoma **read-only** che genera un APK installabile per ispezionare dispositivi Bluetooth Classic e BLE autorizzati.

## Cosa legge
Dispositivi associati e rilevabili, nome/indirizzo quando Android lo espone, RSSI, stato di associazione, tipo/classe, UUID, advertising BLE, manufacturer/service data e gerarchia GATT. Le caratteristiche GATT vengono lette solo quando dichiarano la proprietà READ.

## Cosa non fa
Non aggira pairing o autenticazione, non recupera credenziali, non forza accessi, non sfrutta vulnerabilità, non scrive caratteristiche GATT e non modifica firmware.

## Compilazione
JDK 17 + Android SDK 36 + Gradle 9.6: `gradle testDebugUnitTest assembleDebug`. APK: `app/build/outputs/apk/debug/app-debug.apk`.

Il repository pubblico non contiene configurazioni della dashboard privata, credenziali, percorsi locali o riferimenti all'infrastruttura privata.
