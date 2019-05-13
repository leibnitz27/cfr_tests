package org.benf.cfr.tests;

import org.benf.cfr.tests.support.ListFactory;

import java.util.List;

public class ScopeTest16 {

    public static void test(char[] chars) {
        List<Object> list = ListFactory.newList();
        list.add(1);
        list.add(2);
        for (Object o : list) {
            System.out.print(o);
        }
        list = ListFactory.newList();
        list.add("A");
        list.add("B");
        for (Object o : list) {
            System.out.print((String)o);
        }
    }

}
