package org.benf.cfr.tests;

public class LocalVarClashTest {
    public static void foo(int x) {
        while (true) {
            if (x == 0) {
                String z = "bar";
                System.out.println(z.charAt(1));
            } else {
                Integer z = 1; 
                System.out.println(z.byteValue());
            }
        }
    }
}
