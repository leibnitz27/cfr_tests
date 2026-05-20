package org.benf.cfr.tests;

public class InstanceOfMatchSafetyLoop1 {

    public String lastSeen(Object o) {
        String last = null;
        while (o instanceof String) {
            last = (String) o;
            o = last.substring(1);
        }
        return last;
    }
}
