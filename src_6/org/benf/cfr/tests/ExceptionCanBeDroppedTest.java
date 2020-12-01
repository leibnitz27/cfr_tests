package org.benf.cfr.tests;

// In *very* agressive cases, this catch block can be dropped.
public class ExceptionCanBeDroppedTest {
    public static int decompileWrong(int x) {
        try {
            return x;
        } catch (Throwable t) {
            System.out.println("HERE I AM TO CONFUSE YOU");
            x = x + 3;
            System.out.println("HERE I AM TO CONFUSE YOU " + x);
            return x;
        }
    }
}
