package org.benf.cfr.tests;

public class InfiniteLoopTest2 {
    public void foo(int x,int y) {
        do {
            if (x>y) break;
            System.out.println(x);
            x++;
        } while (true);
    }
}
