package org.benf.cfr.tests;

public class VarTypeTest7 {

    public static void test1() {
        try (var x = new AutoCloseable() {
            private void test() {
                System.out.println("Test!");
            }

            @Override
            public void close() {
                System.out.println("Close!");
            }
        }) {
            x.test();
        }
    }
}
