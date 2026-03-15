package org.benf.cfr.tests;

import java.time.DayOfWeek;

public class EnumSwitchTest1b {

    public String test0(DayOfWeek d) {
        switch (d) {
            case MONDAY:
                return "start of week";
            case FRIDAY:
                return "almost weekend";
            case SATURDAY:
            case SUNDAY:
                return "weekend";
            default:
                return "midweek";
        }
    }
}
