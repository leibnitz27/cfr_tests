package org.benf.cfr.tests;

public class VarTypeTest6 {

    public static void test1() {
        try (var x = new AutoCloseable() {
            double dVal = 1.2;
            @Override
            public void close() {
                System.out.println("Close!");
            }
        }) {
            System.out.println(x.dVal);
        }
    }
}
