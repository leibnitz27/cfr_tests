package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 */
public class StaticTest5 extends StaticTest4 {
    public static void foo1(int x2) {
        s.s.x = x2;
        StaticTest4.x = x2;
        x = x2;
    }
}
