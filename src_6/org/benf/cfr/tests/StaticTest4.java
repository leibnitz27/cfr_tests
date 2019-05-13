package org.benf.cfr.tests;

import org.benf.cfr.tests.support.ListFactory;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 */
public class StaticTest4 {
    public static StaticTest4 s = new StaticTest4();
    public static int x;

    public static void foo1(int x2) {
        x = x2;
    }
}
