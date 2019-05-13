package org.benf.cfr.tests;

public class VarTypeTest2 {
    public static void test1() {
        var x = new VarTypeTestBob() {
            int foo = 3;
        };
        System.out.println(x.foo);
    }

    public static void test2() {
        VarTypeTestBob x = new VarTypeTestBob() {
            int foo = 3;
        };
        System.out.println(x.foo);
    }
}
