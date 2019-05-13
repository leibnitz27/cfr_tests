package org.benf.cfr.tests;

import org.benf.cfr.tests.support.ListFactory;
import org.benf.cfr.tests.support.SetFactory;

import java.util.List;
import java.util.Set;

public class ScopeTest14 {

    public static void test() {
        {
            List<Integer> set = ListFactory.newList();
            set.add(1);
            set.add(2);
            for (Integer i : set) {
                System.out.print(i);
            }
        }
    }
}
