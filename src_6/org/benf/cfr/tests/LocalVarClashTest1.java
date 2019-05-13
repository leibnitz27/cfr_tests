package org.benf.cfr.tests;

public class LocalVarClashTest1 {
    public static void foo(int x) {
        while (true) {
            Object z;
            if (x == 0) {
                z = "bar";
                System.out.println(((String)z).charAt(1));
            } else {
                z = 1;
                System.out.println(((Integer)z).byteValue());
            }
        }
    }
}
