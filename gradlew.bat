@echo off

rem Gradle wrapper script
setlocal
set GRADLE_HOME=gradle\
set PATH=%PATH%;%GRADLE_HOME%

if exist gradlew.bat (
    gradlew %*
) else (
    echo Gradle wrapper not found. Please install Gradle wrapper first.
)
endlocal