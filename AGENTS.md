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

Available profiles: `java_6`, `java_8`, `ojava_8`, `java_10`, `java_12`, `java_13`, `java_14`, `java_16`, `java_18`, `java_25`, `ecj_8`.

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

## Java 25 Tests

Located in `src_25/org/benf/cfr/tests/`:

| File | Tests |
|------|-------|
| `FlexibleConstructorBody1.java` | Pre-super/this statements in constructors (JEP 492) |
| `PrimitivePatterns1.java` | Primitive patterns in switch/instanceof, narrowing, mixed primitive/reference |
| `PrimitivePatterns2.java` | Multi-label case patterns (`Bar _, Bap _`), `null, default` |
| `PrimitivePatterns3.java` | Multiple guarded patterns on same type with different `when` conditions |
| `PrimitivePatterns4.java` | Guards referencing external variables, compound boolean guards |
| `PrimitivePatterns4b.java` | Same as 4 but as statement switch with `break` instead of expression switch |
