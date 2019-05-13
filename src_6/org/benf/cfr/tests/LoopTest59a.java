package org.benf.cfr.tests;

import java.util.Iterator;
import java.util.List;

public class LoopTest59a {

    public void cannotMoveIteratorVariableDeclaration(List<Integer> l2) {
        for (Iterator<Integer> i$ = l2.iterator(); i$.hasNext();) {
            final Integer i2 = i$.next();
            if (i2 == null) break;
            System.out.println(i2);
        }
    }
}
