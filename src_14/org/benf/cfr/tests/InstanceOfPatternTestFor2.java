package org.benf.cfr.tests;

public class InstanceOfPatternTestFor2 {
    int m(Object o) {
        int sum = 0;
        for (int i = 0; o instanceof String s && i < 5; ++i) {
            sum += s.charAt(i % s.length());
            o = s.isEmpty() ? null : s.substring(1);
        }
        return sum;
    }
}
