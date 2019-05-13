package org.benf.cfr.tests;

import java.util.EnumSet;

public class EnumTest16 {
    EnumSet<EnumTest1> enumSet = EnumSet.noneOf(EnumTest1.class);

    public void test() {

        enumSet.add(EnumTest1.BAP);
        enumSet.add(EnumTest1.BAR);
    }
}

