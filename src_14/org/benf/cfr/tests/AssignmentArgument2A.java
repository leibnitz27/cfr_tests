package org.benf.cfr.tests;

public class AssignmentArgument2A {
    AssignmentArgument2A(int a) {
    }

    static int testConstructor2(int a) {
        try {
            new AssignmentArgument2A(a = switch (a) {
                case 1 -> 1;
                case 2 -> 2;
                default -> 3;
            });
        } catch (OutOfMemoryError e) { }
        return a;
    }
}
