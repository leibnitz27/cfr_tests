package org.benf.cfr.tests;

public class InstanceOfPatternTestLoop6 {
    int m(Object o) {
        int total = 0;
        while (o instanceof String s) {
            s = s.trim();
            total += s.length();
            o = s.isEmpty() ? null : s.substring(1);
        }
        return total;
    }
}
