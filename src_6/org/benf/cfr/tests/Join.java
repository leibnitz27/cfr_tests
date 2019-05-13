package org.benf.cfr.tests;

public class Join {
    public static void main(String[] args) throws Throwable {
        try {
            test(args);
        } catch(Throwable t) {
            System.out.println("three");
        }
    }

    static void test(Object o) throws Throwable {
        try {
            throw new Exception();
        } catch (Throwable t) {
            System.out.println("one");
        } finally {
            synchronized(o){} // this statement seemingly confuses CFR
            try {
                throw new Exception();
            } catch (Throwable t) {
                System.out.println("two");
                throw t;
            }
        }
    }
}
