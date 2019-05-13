package org.benf.cfr.tests;

import java.util.Iterator;
import java.util.List;

public class LoopTest27 {

    public boolean cannotMoveIteratorVariableDeclaration(List<Integer> l2) {
        Iterator<Integer> i$ = l2.iterator();
        while (i$.hasNext()) {
            final Integer i2 = i$.next();
            System.out.println(i2);
        }
        /*
         * blah
         *
         */
        return i$ == null;
    }
}
