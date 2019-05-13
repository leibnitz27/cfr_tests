package org.benf.cfr.tests;

import org.benf.cfr.tests.support.ListFactory;

import java.util.List;

public class ScopeTest15 {

    public static void test(char[] chars) {
        {
            List<Integer> set = ListFactory.newList();
            set.add(1);
            set.add(2);
            for (Integer i : set) {
                System.out.print(i);
            }
        }
        {
            List<String> set = ListFactory.newList();
            set.add("A");
            set.add("B");
            for (String i : set) {
                System.out.print(i);
            }
        }
    }

}
