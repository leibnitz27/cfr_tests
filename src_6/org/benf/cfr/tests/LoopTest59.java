package org.benf.cfr.tests;

import java.util.Iterator;
import java.util.List;

public class LoopTest59 {

    public void cannotMoveIteratorVariableDeclaration(List<Integer> l2) {
        for (Iterator<Integer> i$ = l2.iterator(); i$.hasNext();) {
            final Integer i2 = i$.next();
            System.out.println(i2);
        }
    }
}
