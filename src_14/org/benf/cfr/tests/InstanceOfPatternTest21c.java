package org.benf.cfr.tests;

public class InstanceOfPatternTest21c {
    int m(Object o) {
        int r;
        String s = null;
        if (o instanceof String) {
            s = (String) o;
            r = s.length();
        } else {
            r = 5;
            if (s == null) r = 3;
        }
        return r + 1;
    }
}
