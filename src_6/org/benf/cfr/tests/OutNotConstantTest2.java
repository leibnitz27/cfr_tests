package org.benf.cfr.tests;

import java.io.PrintStream;

public class OutNotConstantTest2 {
    public static void main(String ... args) {
        try {
            doAthing();
        } catch (Throwable t) {
            System.err.println("You found it!");
        }
    }

    private static void doAthing() {
        PrintStream ps = System.out;
        if (ps == null) {
            System.err.println("Nothing to see.");
        } else {
            System.err.println("Nothing to see.");
        }
    }
}
