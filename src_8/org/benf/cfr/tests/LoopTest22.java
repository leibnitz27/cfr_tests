package org.benf.cfr.tests;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LoopTest22 {
    public void canMoveIteratorVariableDeclaration(final List<List<Integer>> lists) {
        for (final List<Integer> list : lists) {
            Iterator<Integer> it;

            it = list.iterator();

            while (it.hasNext()) {
                final Integer next = it.next();
                System.out.println(next);
            }

            it = list.iterator();

            while (it.hasNext()) {
                final Integer next = it.next();
                System.out.println(next);
            }
        }
    }

    private static Iterator<Integer> empty() {
        return Collections.emptyIterator();
    }

    public void cannotMoveIteratorVariableDeclaration(final List<List<Integer>> lists) {
        for (final List<Integer> list : lists) {
            Iterator<Integer> it = empty();

            System.out.println(it);

            it = list.iterator();

            while (it.hasNext()) {
                final Integer next = it.next();
                System.out.println(next);
            }

            System.out.println(it);
            it = list.iterator();

            while (it.hasNext()) {
                final Integer next = it.next();
                System.out.println(next);
            }
        }
    }
}
