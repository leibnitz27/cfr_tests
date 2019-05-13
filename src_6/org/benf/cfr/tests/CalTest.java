package org.benf.cfr.tests;

import java.util.Calendar;

public class CalTest {

    public void test1(String s) {
        System.out.println(Calendar.getInstance().getTimeZone().getID());
    }

    public static void main(String[] args) {
        new CalTest().test1(args[0]);
    }
}
