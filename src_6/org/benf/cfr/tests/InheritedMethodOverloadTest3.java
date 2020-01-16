package org.benf.cfr.tests;

// https://github.com/leibnitz27/cfr/issues/80
class InheritedMethodOverloadTest3 {
    static class Base {
        void inherited(long i) { }
        void inheritedObj(Object s) { }
    }

    static class Nested extends Base {
        int i = 1;
        String s = "";

        void inherited(int n) {
            System.out.println("inherited");
        }
        void inheritedObj(String o) {
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