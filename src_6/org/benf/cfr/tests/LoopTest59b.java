package org.benf.cfr.tests;

import java.util.Iterator;
import java.util.List;

public class LoopTest59b {

    public void cannotMoveIteratorVariableDeclaration(List<Integer> l2) {
        for (Iterator<Integer> i$ = l2.iterator(); i$.hasNext();) {
            final Integer i2 = i$.next();
            if (i2 == null) break;
            if (i2 == 1) break;
            if (i2 == 4) break;
            System.out.println(i2);
        }
    }
}
