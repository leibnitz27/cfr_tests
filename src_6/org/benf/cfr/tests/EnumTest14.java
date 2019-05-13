package org.benf.cfr.tests;

import org.benf.cfr.tests.support.MapFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public enum EnumTest14 {
    FOO(1),
    BAR(2),
    BAP(4);

    private final int x;

    private EnumTest14(int x) {
        this.x = x;
    }

    private static final Map<Integer, Set<String>> implicitCasts;
    private static final List< Integer> boxingTypes;

    static {
        implicitCasts = MapFactory.newMap();
        int implicitCasts = 3;
        boxingTypes = new ArrayList<Integer>(implicitCasts);
        String boxingTypes = "Hello";
        System.out.println(boxingTypes + implicitCasts);
    }

}

