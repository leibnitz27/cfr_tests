package org.benf.cfr.tests;

public class LoopTest61 {

    public int cannotMoveIteratorVariableDeclaration(int start, int[] l2) {
        for (final int x : l2) {
            // ignore.
        }
        return l2.length;
    }
}
