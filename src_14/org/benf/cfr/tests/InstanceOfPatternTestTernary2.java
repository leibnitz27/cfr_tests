package org.benf.cfr.tests;

public class InstanceOfPatternTestTernary2 {
    int m(Object o) {
        return o instanceof String s && s.length() > 3 ? s.length() : (o.toString()).length();
    }
}
