package org.benf.cfr.tests;

public class InstanceOfPatternTestLoop7 {
    int m(Object o) {
        int n = 0;
        while (o instanceof Object[] a && a.length > 0) {
            Object e = a[0];
            if (e instanceof String s) {
                n += s.length();
            }
            o = a.length > 1 ? a[1] : null;
        }
        return n;
    }
}
