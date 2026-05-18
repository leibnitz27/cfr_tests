package org.benf.cfr.tests;

public class InstanceOfPatternTestFor1 {
    int m(Object o) {
        int n = 0;
        for (; o instanceof String s; o = s.isEmpty() ? null : s.substring(1)) {
            n += s.length();
        }
        return n;
    }
}
