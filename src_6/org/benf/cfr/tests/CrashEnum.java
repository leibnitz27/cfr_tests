package org.benf.cfr.tests;

public enum CrashEnum {
    SAMPLE;

    public CrashEnum[] cloneValues() {
        return ((CrashEnum[]) null).clone();
    }
}