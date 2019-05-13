package org.benf.cfr.tests;

public class LoopTest32 {

    public void cannotMoveIteratorVariableDeclaration(Integer[] l2, Integer[] l3) {
        Integer[] arr$ = l2;
        int len$ = arr$.length;
        for (int i$ = 0; i$ < len$; ++i$) {
            Integer i = arr$[i$];
            System.out.println((len$ = l3.length * 2));
            System.out.println(i);
            for (int x=0;x<10;++x);
            for (int x=0;x<10;++x);
        }
    }
}
