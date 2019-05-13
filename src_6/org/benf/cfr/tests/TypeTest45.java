package org.benf.cfr.tests;

import org.benf.cfr.tests.support.ListFactory;

import java.util.List;

public class TypeTest45 {

    public void test(List<Integer> list) {
        Integer best = null;
        List<Integer> res = ListFactory.newList();
        for (Integer i : list) {
            if (best == null || best.byteValue() < i.byteValue()) best = i;
        }
        if (best != null) res.add(best);
        System.out.print(best);
    }
}
