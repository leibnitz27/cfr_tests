package org.benf.cfr.tests;

public class LoopTest33 {

    public void cannotMoveIteratorVariableDeclaration(Integer[] l2, Integer[] l3) {
        Integer[] arr$ = l2;
        int len$ = arr$.length;
        for (int i$ = 0; i$ < len$; ++i$) {
            Integer i = arr$[i$ > 2 ? i$ : 2];
            System.out.println(i);
        }
    }
}
