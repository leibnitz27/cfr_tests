package org.benf.cfr.tests;

import org.benf.cfr.tests.support.ListFactory;

import java.util.List;

public class ScopeTest15a {

    public static void test(char[] chars) {
        {
            List<Integer> set = ListFactory.newList();
            set.add(1);
        }
    }

}
