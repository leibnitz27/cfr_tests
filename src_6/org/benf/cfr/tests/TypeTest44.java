package org.benf.cfr.tests;

import java.util.List;

public class TypeTest44 {

    public void test(List<Integer> list) {
        Integer best = null;
        for (Integer i : list) {
            if (i.compareTo(best) > 0) best = i;
        }
        System.out.print(best);
    }
}
