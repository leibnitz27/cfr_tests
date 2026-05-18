package org.benf.cfr.tests;

public class InstanceOfPatternTestLoop5 {
    int m(Object o) {
        while (!(o instanceof String s)) {
            o = o.toString();
        }
        return s.length();
    }
}
