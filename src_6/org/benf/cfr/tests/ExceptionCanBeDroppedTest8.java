package org.benf.cfr.tests;

// fdiv can't.
public class ExceptionCanBeDroppedTest8 {
    public static void main(String ... args) {
        double x = 3;
        try {
            x = x/0;
        } catch (Throwable t) {
            x = 123;
        }
        System.out.println("x = " + x);
    }
}
