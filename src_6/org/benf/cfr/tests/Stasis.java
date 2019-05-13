package org.benf.cfr.tests;

class Stasis {

    static final String s;
    static final String s2;

    static {
        // CFR decompiles String as Object
        final String pc = null;
        // CFR references s2 explicitly, further preventing compilation
        s = s2 = pc;
    }

}