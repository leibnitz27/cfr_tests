package org.benf.cfr.tests;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LoopTest24 {

    public void cannotMoveIteratorVariableDeclaration(List<Integer> l2) {
        Iterator<Integer> i$ = l2.iterator();
        while (i$.hasNext()) {
            final Integer i2 = i$.next();
            System.out.println(i2);
            System.out.println(i$.hasNext());
        }
    }
}
