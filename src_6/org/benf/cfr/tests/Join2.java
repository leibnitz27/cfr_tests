package org.benf.cfr.tests;

public class Join2 {
    static void test(Object o) throws Throwable {
        try {
            throw new Exception();
        } catch (Throwable t) {
            System.out.println("one");
        } finally {
            try {
                throw new Exception();
            } catch (Throwable t) {
                System.out.println("two");
                throw t;
            }
        }
    }
}
