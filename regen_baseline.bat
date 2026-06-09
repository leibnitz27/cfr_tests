@echo off
REM
REM Recompile EVERY test-version profile, then regenerate ALL regtest baselines.
REM
REM regtest.py does NOT compile the test sources - if you skip this you will be
REM decompiling stale .class files and comparing against (or worse, accepting)
REM out-of-date output.
REM
REM Requires CFR_TARGET to point at a freshly-built CFR (run `mvn compile` in the
REM CFR project root first). Defaults to ..\..\target\classes relative to this
REM script if CFR_TARGET is not already set.
REM
REM This ACCEPTS new baselines (regtest --force y). Review the resulting diff in
REM git before committing.
REM
REM
REM The target list below MUST stay in sync with the profiles in compile.bat.
REM regtest.py --force y auto-creates expected/<target>/ if it doesn't exist
REM yet, so new versions get fresh baselines on first run.
REM
cd /d "%~dp0"
if not defined CFR_TARGET set CFR_TARGET=%CD%\..\..\target\classes
@echo on
call compile.bat
@echo off
for %%V in (java_6 java_8 ojava_8 java_10 java_12 java_13 java_14 java_16 java_18 java_19 java_20 java_21 java_22 java_24 java_25 ecj_8) do (
    echo === Regenerating baseline: %%V ===
    python regtest.py --target %%V --force y
)
echo === Baseline regeneration complete - review `git diff` before committing ===
