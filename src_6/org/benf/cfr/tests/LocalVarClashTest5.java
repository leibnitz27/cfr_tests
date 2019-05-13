package org.benf.cfr.tests;

public class LocalVarClashTest5 {
    public static void foo(int x) {
        Object y;
        {
            y = (Integer)3;
            System.out.println(y);
        }
        {
            y = "3";
            System.out.println(y);
        }
    }
}
