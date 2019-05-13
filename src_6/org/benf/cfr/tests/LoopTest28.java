package org.benf.cfr.tests;

import java.util.Iterator;
import java.util.List;

public class LoopTest28 {

    public boolean cannotMoveIteratorVariableDeclaration(List<Integer> l2) {

        for (Integer i : l2) {
            Iterator<Integer> i$ = l2.iterator();
            while (i$.hasNext()) {
                final Integer i2 = i$.next();
                System.out.println(i2);
                for (Integer i3 : l2) {
                    System.out.println(i3);
                }
            }
            if (i$.hasNext()) return false;
        }
        /*
         * blah
         *
         */
        return true;
    }
}
