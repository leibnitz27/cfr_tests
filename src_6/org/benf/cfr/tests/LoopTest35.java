package org.benf.cfr.tests;

public class LoopTest35 {

    public int candoit(Integer[] l2) {
        Integer[] arr$ = l2;
        int len$ = arr$.length;
        for (int i$ = 0; i$ < len$; ++i$) {
            Integer i = arr$[i$];
            System.out.println(i);
        }
        return arr$[len$-1];
    }
}
