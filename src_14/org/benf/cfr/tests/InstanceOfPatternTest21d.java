package org.benf.cfr.tests;

public class InstanceOfPatternTest21d {
    int m(Object o) {
        int r;
        String s;
        if (o instanceof String) {
            s = (String) o;
            r = s.length();
        } else {
            s = o.toString();
            r = s.length();
        }
        return r + s.length();
    }
}
