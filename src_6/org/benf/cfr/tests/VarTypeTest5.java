package org.benf.cfr.tests;

public class VarTypeTest5 {

    public static void test1() {
        VarTypeTestFred2 x = new VarTypeTestFred2() {
        };
        System.out.println(x.bar);
        System.out.println(x.foo);
        System.out.println(((VarTypeTestFred2)x).foo);
        System.out.println(((VarTypeTestBob)x).foo);
    }
}
