package org.benf.cfr.tests;

public class InstanceOfPatternTestTernary3 {
    int m(Object o) {
        return !(o instanceof String s) ? (o.toString()).length() : s.length();
    }
}
