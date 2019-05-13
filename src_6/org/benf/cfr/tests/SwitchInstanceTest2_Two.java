package org.benf.cfr.tests;

public class SwitchInstanceTest2_Two implements Singleton {
    public static final Singleton INSTANCE = new SwitchInstanceTest2_Two();

    @Override
    public int getInt() {
        return 2;
    }
}
