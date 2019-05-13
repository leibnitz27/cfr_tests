package org.benf.cfr.tests;

public class VarTypeTest2a {
    public static void test2() {
        VarTypeTestBob x = new VarTypeTestBob() {
            int foo = 3;
        };
        System.out.println(x.foo);
    }
}
