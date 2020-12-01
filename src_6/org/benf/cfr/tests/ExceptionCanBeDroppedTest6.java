package org.benf.cfr.tests;

// In *very* agressive cases, this catch block can be dropped.
public class ExceptionCanBeDroppedTest6 {
    public static int decompileWrong(int x) {
        block :
        {
            try {
                if (x<4) break block;
            } catch (Throwable t) {
                System.out.println("HERE I AM TO CONFUSE YOU");
                x = x + 3;
                System.out.println("HERE I AM TO CONFUSE YOU " + x);
            }
        }
        return x;
    }
}
