package org.benf.cfr.tests;

// In *very* agressive cases, this catch block can be dropped.
public class ExceptionCanBeDroppedTest3 {
    public static int decompileWrong(int x) {
        try {
            // actually, javac won't even generate.
        } catch (Throwable t) {
            System.out.println("HERE I AM TO CONFUSE YOU");
            x = x + 3;
            System.out.println("HERE I AM TO CONFUSE YOU " + x);
            return x;
        }
        return x;
    }
}
