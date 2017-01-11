# {N} Functional Tests - Demo Project

Hello-world project to demonstrate [NativeScript/functional-tests-core](https://github.com/NativeScript/functional-tests-core).

## Prerequisites and Environment Setup

Prerequisites and steps to setup environment are actually the same as those for [NativeScript/functional-tests-core](https://github.com/NativeScript/functional-tests-core).

Please read [this document](https://github.com/NativeScript/functional-tests-core/blob/master/docs/setup.md).

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

**Logs**
- Test Execution Logs: $PROJECT_ROOT/target/surefire-reports/logs/log4j.log
- Device Logs: $PROJECT_ROOT/target/surefire-reports/logs/console/*
- Screenshots: $PROJECT_ROOT/target/surefire-reports/screenshots/*
- Perf Info: $PROJECT_ROOT/target/surefire-reports/logs/perfInfo.csv