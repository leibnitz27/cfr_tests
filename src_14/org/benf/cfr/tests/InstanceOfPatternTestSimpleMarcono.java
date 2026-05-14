package org.benf.cfr.tests;

class InstanceOfPatterTestSimpleMarcono {
    int m(Object o1, Object o2) {
        if (o1 instanceof String s1 && o2 instanceof String s2) {
            return s1.compareTo(s2);
        }
        return 0;
    }
}