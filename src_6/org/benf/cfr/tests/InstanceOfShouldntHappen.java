package org.benf.cfr.tests;


public class InstanceOfShouldntHappen {

    public int func2(Object a, String b) {
        if (a instanceof String) {
            String s = (String)a;
            if (s.length() == b.length()) return s.length();
        }
        return 0;
    }

}
