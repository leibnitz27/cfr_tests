package org.benf.cfr.tests;

public class LoopTest34 {

    public void cannotMoveIteratorVariableDeclaration(Integer[] l2, Integer[] l3) {
        for (Integer i : l2) {
            i = l3[i];
        }
    }
}
