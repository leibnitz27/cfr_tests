package org.benf.cfr.tests;

import org.benf.cfr.tests.support.UnaryFunction;

import java.util.*;

public class TypeTest38 {
    public static <Y, X> List<Y> groupBy(List<X> input, Comparator<? super X> comparator, UnaryFunction<List<X>, Y> gf) {
        TreeMap<X, List<X>> temp = new TreeMap<X, List<X>>(comparator);
        for (X x : input) {
            List<X> lx = temp.get(x);
            if (lx == null) {
                lx = new ArrayList<X>();
                temp.put(x, lx);
            }
            lx.add(x);
        }
        List<Y> res = new ArrayList<Y>();
        for (List<X> lx : temp.values()) {
            res.add(gf.invoke(lx));
        }
        return res;
    }

}
