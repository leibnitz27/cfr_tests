package org.benf.cfr.tests;

public class SuperMemberCast {

    public static class Foo {
        private String bar() {
            return "hello";
        }
    }

    public static class Bop extends Foo {
        private int bar() {
            return 1;
        }

        public void test() {
            String s1 = super.bar();
            String s2 = ((Foo)this).bar();
            int i1 = bar();
            int i2 = ((Bop)this).bar();
            System.out.println("" + s1 + "," + s2 + "," + i1 + "," + i2);
        }
    }

    public static void main(String...args) {
        new Bop().test();
    }
}
