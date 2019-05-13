package org.benf.cfr.tests;

public class VarTypeTest3 {
    private static class Bob {
        public int foo;
    }

    private static class Fred extends Bob {
        public int foo;
    }

    public static void test1() {
        var x = new Fred() {
            int foo = 3;
        };
        System.out.println(x.foo);
    }

    public static void test2() {
        Bob x = new Fred() {
            int foo = 3;
        };
        System.out.println(x.foo);
    }

    public static void test3() {
        Fred x = new Fred() {
            int foo = 3;
        };
        System.out.println(x.foo);
    }
}
