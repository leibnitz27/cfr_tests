package org.benf.cfr.tests;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

class AbeDescent {
    @Marker(true) // CFR decompiles as 1
    public static void boolMark(String[] args) {
    }

    @IntMarker(1) // CFR decompiles as 1
    public static void intMark(String[] args) {
    }
}

@Retention(RetentionPolicy.RUNTIME)
@interface Marker {
    boolean value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface IntMarker {
    int value();
}


