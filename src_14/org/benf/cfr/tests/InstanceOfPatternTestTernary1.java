package org.benf.cfr.tests;

public class InstanceOfPatternTestTernary1 {
    int m(Object o) {
        return o instanceof String s ? s.length() : (o.toString()).length();
    }
}
