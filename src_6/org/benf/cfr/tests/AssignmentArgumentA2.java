package org.benf.cfr.tests;

class AssignmentArgumentA2 {
    private AssignmentArgumentA2(int x) {

    }

    static void testConstructor(int a) {
        int b;
        new AssignmentArgumentA2(b = a);

        System.out.println(a == b);
    }
}