package org.benf.cfr.tests;

public class StackMapTest1 {
    public void foo(boolean a, boolean b) {
        if (a) {
            String s = new String("fdfd");
            System.out.println(s);
        }
        if (b) {
            Integer i = new Integer(1);
            System.out.println(i);
        }
    }
}
