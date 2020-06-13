package org.benf.cfr.tests;

class AssignmentArgument {
    static class TestClass {
        TestClass(int i) { }
    }

    static void testConstructor(int a) {
        int b;
        new TestClass(b = a);

        System.out.println(a == b);
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