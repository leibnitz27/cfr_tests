package org.benf.cfr.tests;

public class VarOrderingTest {
    // Attempt to reproduce issue https://github.com/leibnitz27/cfr/issues/41
    // Note that this doesn't reliably manifest in j10, but does in j8.

    public static void main(String ... args) {
        int x;
        int y;
        int z;
        if (args.length < 3) {
            x = 1;
            y = 2;
            z = 3;
        } else {
            z = 4;;
            y = 3;
            x = 2;
        }
        System.out.println("" + x+ y + z);
    }
}
