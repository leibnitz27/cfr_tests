package org.benf.cfr.tests;

public class InstanceOfMatchSafetyLoop3 {

    public int twoLoops(Object a, Object b) {
        int sum = 0;
        while (a instanceof String) {
            String s = (String) a;
            sum += s.length();
            a = s.substring(1);
        }
        while (b instanceof String) {
            String s = (String) b;
            sum += s.length();
            b = s.substring(1);
        }
        return sum;
    }
}
