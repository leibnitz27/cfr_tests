@echo off
REM
REM Maven's not really designed to loop around configurations,
REM which is unfortunate, because ... not ant ;)
REM
@echo on
call mvn compile -P j6
call mvn compile -P j8
call mvn compile -P j10
call mvn compile -P j12
call mvn compile -P j13