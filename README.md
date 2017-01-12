# {N} Functional Tests - Demo Project

Hello-world project to demonstrate [NativeScript/functional-tests-core](https://github.com/NativeScript/functional-tests-core).

## Prerequisites and Environment Setup

Prerequisites and steps to setup environment are actually the same as those for [NativeScript/functional-tests-core](https://github.com/NativeScript/functional-tests-core).

Please read [this document](https://github.com/NativeScript/functional-tests-core/blob/master/docs/setup.md).

The only additional thing you need for this project is [Maven](https://maven.apache.org/install.html).

Please install it make sure `mvn` command is available in command prompt.

## Before running tests

**Install functional-tests-core package**
```
mvn install:install-file -Dfile=libs/functional.tests.core-0.0.5.jar -DgroupId=functional.tests.core -DartifactId=functional.tests.core -Dversion=0.0.5 -Dpackaging=jar
```

**Make sure appropriate emulator/simulator/device is available**

After you finish steps from [this document](https://github.com/NativeScript/functional-tests-core/blob/master/docs/setup.md) make sure you have following emulators:
```
$ANDROID_HOME/tools/android create avd -n Emulator-Api19-Default -t android-19 --abi default/x86 -c 12M -f
$ANDROID_HOME/tools/android create avd -n Emulator-Api23-Default -t android-23 --abi default/x86 -c 12M -f
```

**Edit configs if required**

If you want you can edit configs (for example specify unique device id of your device).

Config files are at `resources/config/<name of the app>/<config name>.properties`

**[Config entries reference](https://github.com/NativeScript/functional-tests-core/blob/master/docs/settings.md)**


## Run tests

**Run from command line with Maven**

```
mvn clean test -P nativeapp.emu.default.api23
```

**Run tests in Eclipse/IntelliJ IDEA**

Place this in Vm options: 
```
-DappConfig=resources/config/nativeapp/nativeapp.emu.default.api23.properties
```

## Test results

**HTML Report**
- $PROJECT_ROOT/target/surefire-reports/html/index.html
![](docs/html-report.png?raw=true)

**Logs**
- Test Execution Logs: $PROJECT_ROOT/target/surefire-reports/logs/log4j.log
- Device Logs: $PROJECT_ROOT/target/surefire-reports/logs/console/*
- Screenshots: $PROJECT_ROOT/target/surefire-reports/screenshots/*
- Perf Info: $PROJECT_ROOT/target/surefire-reports/logs/perfInfo.csv