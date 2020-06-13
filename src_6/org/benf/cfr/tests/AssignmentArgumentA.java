package org.benf.cfr.tests;

class AssignmentArgumentA {
    private AssignmentArgumentA(int x) {

    }

    static void testConstructor(int a) {
        int b;
        new AssignmentArgumentA(b = a);

        System.out.println(a == b);
    }
}