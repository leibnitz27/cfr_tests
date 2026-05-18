package org.benf.cfr.tests;

public class InstanceOfPatternTestLoop4 {
    int m(Object o) {
        String s = "";
        while (o instanceof String) {
            s = (String) o;
            o = s.isEmpty() ? null : s.substring(1);
        }
        return s.length();
    }
}
