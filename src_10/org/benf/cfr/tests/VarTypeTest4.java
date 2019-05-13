package org.benf.cfr.tests;

public class VarTypeTest4 {

    public static void test1() {
        var x = new VarTypeTestFred() {
            int foo = 3;
        };
        System.out.println(x.foo);
        System.out.println(((VarTypeTestFred)x).foo);
        System.out.println(((VarTypeTestBob)x).foo);
    }
}
