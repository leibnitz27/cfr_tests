package org.benf.cfr.tests;

import java.util.Iterator;
import java.util.List;

public class LoopTest60 {

    public int cannotMoveIteratorVariableDeclaration(int start, int[] l2) {
        int x=start;
        if (l2[x] > 0) return 1;
        for (x = 3;x<l2.length;++x) {
            if (l2[x] > 0) return 2;
        }
        int y = x;
        return y;
    }
}
