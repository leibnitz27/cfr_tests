package org.benf.cfr.tests;

import org.benf.cfr.tests.support.SetFactory;

import java.util.List;
import java.util.Set;

public class TypeTest43 {

    public void test(List<Integer> list) {
        Integer best = null;
        for (Integer i : list) {
            best = i;
//            if (i.compareTo(best) > 0) best = i;
        }
        System.out.print(best);
    }
}
