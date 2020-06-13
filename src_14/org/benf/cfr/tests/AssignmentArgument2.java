package org.benf.cfr.tests;

public class AssignmentArgument2 {
    static class TestClass {
        TestClass(int i) { }
    }

    static void testConstructor(int a) {
        int b;
        new AssignmentArgument.TestClass(b = a);

        System.out.println(a == b);
    }

    static int testConstructor2(int a) {
        try {
            new TestClass(a = switch (a) {
                case 1 -> 1;
                case 2 -> 2;
                default -> 3;
            });
        } catch (OutOfMemoryError e) { }
        return a;
    }

    static void testMethod(int a) {
        int b;
        testMethod(b = a);

        System.out.println(a == b);
    }

    static void testArray(int a) {
        int b;
        Object o = new int[b = a];

        System.out.println(a == b);
    }
}
