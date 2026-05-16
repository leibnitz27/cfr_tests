#!/bin/bash
#
# Recompile EVERY test-version profile, then regenerate ALL regtest baselines.
#
# regtest.py does NOT compile the test sources - if you skip this you will be
# decompiling stale .class files and comparing against (or worse, accepting)
# out-of-date output.
#
# Requires CFR_TARGET to point at a freshly-built CFR (run `mvn compile` in the
# CFR project root first). Defaults to ../../target/classes relative to this
# script if CFR_TARGET is not already set.
#
# This ACCEPTS new baselines (regtest --force y). Review the resulting diff in
# git before committing.
#
#
# The target list below MUST stay in sync with the profiles in compile.sh.
# regtest.py --force y auto-creates expected/<target>/ if it doesn't exist
# yet, so new versions get fresh baselines on first run.
#
set -e
cd "$(dirname "$0")"
: "${CFR_TARGET:=$PWD/../../target/classes}"
export CFR_TARGET

./compile.sh

for v in java_6 java_8 ojava_8 java_10 java_12 java_13 java_14 java_16 java_18 java_19 java_20 java_21 java_24 java_25 ecj_8; do
    echo "=== Regenerating baseline: $v ==="
    python regtest.py --target "$v" --force y
done
echo "=== Baseline regeneration complete - review 'git diff' before committing ==="
