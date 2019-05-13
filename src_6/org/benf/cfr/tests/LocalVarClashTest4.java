package org.benf.cfr.tests;

public class LocalVarClashTest4 {
    public static void foo(int x) {
        {
            Integer y = 3;
            System.out.println(y);
        }
        {
            String y = "3";
            System.out.println(y);
        }
    }
}
