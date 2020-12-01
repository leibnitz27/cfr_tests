package org.benf.cfr.tests;

// But - this can never be dropped.
public class ExceptionCanBeDroppedTest2a {
    public static int decompileWrong(Integer x) {
        try {
            x = x + 1;
        } catch (Throwable t) {
            System.out.println("HERE I AM TO CONFUSE YOU");
            x = x + 3;
            System.out.println("HERE I AM TO CONFUSE YOU " + x);
            return x;
        }
        return x;
    }
}
