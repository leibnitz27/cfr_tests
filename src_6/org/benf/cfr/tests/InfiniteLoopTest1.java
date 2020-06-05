package org.benf.cfr.tests;

public class InfiniteLoopTest1 {
    public void foo(int x,int y) {
        while (true) {
            if (x>y) break;
            System.out.println(x);
            x++;
        }
    }
}
