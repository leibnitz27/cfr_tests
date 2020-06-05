package org.benf.cfr.tests;

import java.io.PrintStream;

public class OutNotConstantTest {
    public static void main(String ... args) {
        doAthing();
        System.setOut(null);
        doAthing();
    }

    private static void doAthing() {
        PrintStream ps = System.out;
        if (ps == null) {
            System.err.println("You've found it!");
        } else {
            System.err.println("Nothing to see.");
        }
    }
}
