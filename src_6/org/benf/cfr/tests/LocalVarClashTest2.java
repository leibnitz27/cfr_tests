package org.benf.cfr.tests;

public class LocalVarClashTest2 {
    public static void foo(int x) {
            if (x == 0) {
                String z = "bar";
                System.out.println(z.charAt(1));
            } else {
                Integer z2 = 1;
                System.out.println(z2.byteValue());
            }
    }
}
