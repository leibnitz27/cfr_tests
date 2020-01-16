package org.benf.cfr.tests;

// https://github.com/leibnitz27/cfr/issues/80
class InheritedMethodOverloadTest1b {
    static class Base {
        private void inherited(int i) { }
        private void inheritedObj(String s) { }
    }

    static class Nested extends Base {
        int i = 1;
        String s = "";

        void inherited(long n) {
            System.out.println("inherited");
        }
        void inheritedObj(Object o) {
            System.out.println("inheritedObj");
        }

        void test() {
            inherited(i);
            inherited((long) i);
            inheritedObj(s);
            inheritedObj((Object) s);
        }
    }

    public static void main(String... args) {
        new Nested().test();
    }
}