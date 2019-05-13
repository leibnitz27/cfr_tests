package org.benf.cfr.tests;

public class LoopTest31 {

    public void cannotMoveIteratorVariableDeclaration(Integer[] l2, Integer[] l3) {
        Integer[] arr$ = l2;
        int len$ = arr$.length;
        for (int i$ = 0; i$ < len$; ++i$) {
            Integer i = arr$[i$];
            arr$ = l3;
            System.out.println(i);
        }
    }
}
