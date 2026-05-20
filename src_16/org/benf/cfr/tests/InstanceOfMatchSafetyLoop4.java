package org.benf.cfr.tests;

public class InstanceOfMatchSafetyLoop4 {

    public int sumOddBind(Object o) {
        int sum = 0;
        while (o instanceof Number) {
            Number n = (Number) o;
            sum += n.intValue();
            n = Integer.valueOf(sum);
            int next = n.intValue() - 1;
            o = next > 0 ? Integer.valueOf(next) : null;
        }
        return sum;
    }
}
