package org.benf.cfr.tests;

public class VarTypeTest8 {

    public static void test1() {
        var x = new VarTypeTestFred() {

            public String twoString() {
                return "HERE";
            }
        };
        System.out.println(x.twoString());
        System.out.println(((VarTypeTestFred)x).twoString());
        System.out.println(((VarTypeTestBob)x).twoString());
    }
}
