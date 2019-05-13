package org.benf.cfr.tests;

/**
 * Submitted by chrixian
 */
public class LoopTest48 {
    public int test4(int x) {
        outer: while (true) {
            int a = x;
            for (int b=0;b<a;++b) {
                if (b == x-1) continue outer;
                System.out.println("b");
            }
            return 4;
        }
    }
}
