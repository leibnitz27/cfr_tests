package org.benf.cfr.tests;

import org.benf.cfr.tests.support.ListFactory;

import java.util.List;

public class ScopeTest17 {

    public static void main(String... args) {
        try {
            System.out.print("Please");
            List<Object> list = ListFactory.newList();
            list.add(1);
            list.add(2);
            for (Object o : list) {
                System.out.print(o);
            }
            list = ListFactory.newList();
            list.add("A");
            list.add("B");
            list.add(1);
            System.out.print(" do not");
            for (Object o : list) {
                System.out.print((String) o);
            }
        } finally {
            System.out.println(" shoot him");
        }
    }

}
