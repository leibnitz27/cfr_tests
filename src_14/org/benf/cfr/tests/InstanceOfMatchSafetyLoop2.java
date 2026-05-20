package org.benf.cfr.tests;

public class InstanceOfMatchSafetyLoop2 {

    private Object[] items;
    private int idx;

    private Object pop() {
        return items[idx++];
    }

    public int sumLens() {
        int sum = 0;
        while (pop() instanceof String) {
            String s = (String) pop();
            sum += s.length();
        }
        return sum;
    }
}
