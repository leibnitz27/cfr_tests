package org.benf.cfr.tests;

import org.benf.cfr.tests.support.MapFactory;

import java.util.*;

public class EnumTest15 {
    public void test() {
        EnumSet<EnumTest1> enumSet = EnumSet.noneOf(EnumTest1.class);

        enumSet.add(EnumTest1.BAP);
        enumSet.add(EnumTest1.BAR);
    }
}

