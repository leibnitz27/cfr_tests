package org.benf.cfr.tests;

public class InstanceOfPatternTest21b {
    int m(Object o) {
        int r;
        if (o instanceof String s) {
            s = (String) o;
            r = s.length();
        } else {
            String s = o.toString();
            r = s.length();
        }
        return r + 1;
    }
}
