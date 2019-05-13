package org.benf.cfr.tests;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LoopTest23 {
    public void canMoveIteratorVariableDeclaration(final List<List<Integer>> lists) {
        Iterator<List<Integer>> it = lists.iterator();
        while (it.hasNext()) {
            List<Integer> l2 = it.next();
            for (Integer i2 : l2) {
                System.out.println(i2);
            }
            for (Integer i2 : l2) {
                System.out.println(i2);
            }
        }
    }

    private static Iterator<Integer> empty() {
        return Collections.emptyIterator();
    }


    public void canMoveIteratorVariableDeclaration2(final List<List<Integer>> lists) {
        Iterator<List<Integer>> it = lists.iterator();
        while (it.hasNext()) {
            List<Integer> l2 = it.next();
            Iterator<Integer> i$ = l2.iterator();
            while (i$.hasNext()) {
                final Integer i2 = i$.next();
                System.out.println(i2);
            }
        }
    }

    public void cannotMoveIteratorVariableDeclaration(final List<List<Integer>> lists) {
        Iterator<List<Integer>> it = lists.iterator();
        while (it.hasNext()) {
            List<Integer> l2 = it.next();
            Iterator<Integer> i$ = l2.iterator();
            while (i$.hasNext()) {
                final Integer i2 = i$.next();
                System.out.println(i2);
            }
            System.out.println(i$.hasNext());
        }
    }

    public void cannotMoveIteratorVariableDeclaration2(final List<List<Integer>> lists) {
        Iterator<List<Integer>> it = lists.iterator();
        while (it.hasNext()) {
            List<Integer> l2 = it.next();
            Iterator<Integer> i$ = l2.iterator();
            while (i$.hasNext()) {
                final Integer i2 = i$.next();
                System.out.println(i2);
                System.out.println(i$.hasNext());
            }
        }
    }
}
