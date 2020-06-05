@echo off
REM
REM Maven's not really designed to loop around configurations,
REM which is unfortunate, because ... not ant ;)
REM
@echo on
call mvn compile -P java_6
call mvn compile -P java_8
call mvn compile -P ojava_8
call mvn compile -P java_10
call mvn compile -P java_12
call mvn compile -P java_13
call mvn compile -P java_14
call mvn compile -P ecj_8