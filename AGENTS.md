# CFR Test Data - Agent Guide

## Overview

This repo contains Java source files compiled with multiple JDK versions to test the CFR decompiler. It is a git submodule of the main CFR repo, referenced at `decompilation-test/test-data/`.

## Building Tests

### Prerequisites

JDK homes must be defined in `~/.m2/settings.xml` as Maven properties in an always-active `compiler` profile. See `docs/settings.xml` for a template. Example:

```xml
<JAVA_25_HOME>c:\Program Files\Java\jdk-25.0.2</JAVA_25_HOME>
```

### Compiling

Each Java version has a Maven profile. Compile one version at a time:

```bash
cd decompilation-test/test-data
mvn compile -P java_25
```

Or compile all versions: `compile.bat` (Windows) / `compile.sh` (Linux/macOS).

Available profiles: `java_6`, `java_8`, `ojava_8`, `java_10`, `java_12`, `java_13`, `java_14`, `java_16`, `java_18`, `java_19`, `java_20`, `java_21`, `java_24`, `java_25`, `ecj_8`.

### How multi-version compilation works

Each Maven profile defines properties that map source directory slots to actual directories. The `build-helper-maven-plugin` adds these as source directories.

- **Java 25 profile** maps `path.source_25` to `src_25` (real Java 25 sources).
- **Earlier profiles** map `path.source_25` to `src` (no Java 25 code there), so Java 25 sources are never compiled with an older JDK.

Each profile also configures the `maven-compiler-plugin` to fork the correct JDK via `${JAVA_25_HOME}/bin/javac`, sets the language level, and adds `--enable-preview` where needed.

## Source Directory Layout

- `src/` — shared sources available to all profiles
- `src_6/` through `src_25/` — version-specific sources, only compiled by their corresponding profile (and profiles for later versions that support the same features)

Compiled output goes to `output/java_6/`, `output/java_8/`, ..., `output/java_25/`.

## Running the Decompiler Against Tests

From the CFR project root:

```bash
# Build CFR
mvn compile

# Decompile a test class
java -cp target/classes org.benf.cfr.reader.Main decompilation-test/test-data/output/java_25/org/benf/cfr/tests/PrimitivePatterns1.class
```

## Regression Testing

`regtest.py` generates and compares decompilation baselines:

```bash
# Generate a baseline (first time or after intentional changes)
python regtest.py --target java_6 --force y

# Run regression test against baseline
python regtest.py --target java_6
```
## Enum Switch Compilation Strategies

Javac uses different compilation strategies for enum switches depending on Java version and whether the enum is local or external:

### Pre-Java 21
All enum switches use a synthetic `$SwitchMap` int array in a synthetic inner class, populated at class-init time. This maps runtime ordinals to compile-time case numbers, providing binary compatibility if the enum is recompiled independently.

### Java 21+ (JEP 441: Pattern Matching for switch)
- **Local enum** (defined in the same compilation unit): bare `ordinal()` with hardcoded case values, no `$SwitchMap`. Safe because ordinals can't change independently.
- **External enum** (e.g. `java.time.DayOfWeek`): still uses `$SwitchMap` for binary compatibility.
- **Pattern switch on enum via supertype** (e.g. `switch(Object)` with `case Direction.NORTH`): uses `SwitchBootstraps.typeSwitch` with condy `EnumDesc`, or `SwitchBootstraps.enumSwitch` with string constant names. These resolve by name at runtime, making them inherently resilient to ordinal changes.

### Test coverage
- `EnumSwitchTest1.java` (src_6): inner enum — tests both `$SwitchMap` (pre-21) and bare `ordinal()` (21+) paths
- `EnumSwitchTest1b.java` (src_8): external enum (`java.time.DayOfWeek`) — confirms `$SwitchMap` is retained even under Java 21+
- `EnumSwitchTest1c.java` (src_8): same-package enum (`EnumTest1`) — confirms `$SwitchMap` is retained (same-package ≠ same compilation unit)

### Condy EnumDesc (typeSwitch on Object with enum constants)
When enum constants appear as case labels in a `switch(Object)`, javac encodes them as nested `ConstantBootstraps.invoke` dynamic constants:
- Inner condy: `ClassDesc.of("org.benf.cfr.tests.EnumTest1")` — creates a class descriptor
- Outer condy: `EnumDesc.of(classDesc, "FOO")` — creates an enum constant descriptor

The `SwitchBootstraps.typeSwitch` bootstrap resolves these `EnumDesc` values at link time. This applies regardless of whether the enum is inner or external.

Tests: PrimitivePatterns9, 9b (inner enum), 10 (inner enum), 10g (external enum).

### SwitchBootstraps.enumSwitch
When the switch selector is an enum type (not Object), and the switch uses pattern syntax (qualified constants or type patterns), javac uses `SwitchBootstraps.enumSwitch` with string constant names and the enum Class reference.

Tests: PrimitivePatterns10b (inner enum after instanceof), 10h (external enum direct).
