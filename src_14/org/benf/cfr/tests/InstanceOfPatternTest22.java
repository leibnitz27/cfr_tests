package org.benf.cfr.tests;

public class InstanceOfPatternTest22 {
    int m(Object o) {
        String s = null;
        Integer i = null;
        if ((o instanceof String) && ((s = (String)o) == o) && ((Integer)(s.length()) instanceof Integer) && ((i = s.length()) > 2)) {
            System.out.println("foo " + s + " " + i);
        }
        return 0;
    }
}
