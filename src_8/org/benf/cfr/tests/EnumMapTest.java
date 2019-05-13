package org.benf.cfr.tests;

import java.time.DayOfWeek;
import java.util.EnumMap;
import java.util.Map;
import java.util.TimeZone;

public class EnumMapTest {
    private static Map<DayOfWeek, Integer> foo = new EnumMap<DayOfWeek, Integer>(DayOfWeek.class){{
        put(DayOfWeek.MONDAY, 1);
        put(DayOfWeek.TUESDAY, 2);
    }};
}
