package org.benf.cfr.tests;

// idiv can throw....
public class ExceptionCanBeDroppedTest7 {
    public static void main(String ... args) {
        int x = 3;
        try {
            x = x/0;
        } catch (Throwable t) {
            x = 123;
        }
        System.out.println("x = " + x);
    }
}
