# SML Bluetooth Inspector Public — Specifica canonica

**Repository:** `smlethics/mcp-bluetoothinspector-android-java-public`  
**Visibilità:** PUBLIC  
**Data:** 2026-09-05

## Obiettivo

Applicazione Android Java pubblica e standalone per ispezione read-only di dispositivi Bluetooth Classic e BLE, limitata ai metadata legittimamente esposti da Android e dai dispositivi autorizzati.

## Architettura

- Android/Java.
- discovery Bluetooth Classic bonded/discoverable.
- scansione BLE advertising.
- ispezione GATT avviata esplicitamente dall'utente.
- condivisione report JSON tramite share sheet Android.

## Funzioni

- elenco dispositivi Classic;
- BLE RSSI, service UUID, manufacturer/service data;
- servizi, caratteristiche e descrittori GATT;
- lettura solo di caratteristiche con `PROPERTY_READ`;
- export/condivisione JSON.

## Sicurezza

- solo dispositivi propri o autorizzati;
- nessun bypass pairing/autenticazione;
- nessuna estrazione credenziali;
- nessun exploit o brute force;
- nessuna scrittura GATT o modifica firmware.

## Igiene del repository pubblico

- nessuna integrazione con dashboard o infrastruttura privata;
- nessun path macchina locale;
- nessun token/secret;
- configurazioni Android SDK locali fuori dal versionamento.

## Criteri di verifica

1. unit test verdi;
2. build APK riuscita;
3. discovery Classic/BLE funzionante;
4. GATT read limitata alle caratteristiche leggibili;
5. report JSON condivisibile;
6. assenza di capacità write/bypass;
7. repository pubblico sanitizzato.

## Fonti della specifica

Specifica derivata esclusivamente dalla documentazione pubblica del repository. Nessun dettaglio delle chat private è stato trasferito qui.
