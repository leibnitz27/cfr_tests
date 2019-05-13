package org.benf.cfr.tests;

public class LoopTest30 {

    public void cannotMoveIteratorVariableDeclaration(Integer[] l2) {
        Integer[] arr$ = l2;
        int len$ = arr$.length;
        for (int i$ = 0; i$ < len$; ++i$) {
            Integer i = arr$[i$];
            i$ = 0;
            System.out.println(i);
        }
    }
}
