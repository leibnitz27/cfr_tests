package org.benf.cfr.tests;

public class SwitchInstanceTest2_One implements Singleton {
    public static final Singleton INSTANCE = new SwitchInstanceTest2_One();

    @Override
    public int getInt() {
        return 1;
    }
}
