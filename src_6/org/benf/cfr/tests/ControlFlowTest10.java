package org.benf.cfr.tests;

import java.util.List;

public class ControlFlowTest10 {
    public void test(List<Integer> list, Integer i) {
        if (list.isEmpty()) return;
        Integer i2 = list.get(0);
        if (i != null && i2 != null) System.out.println("TEST");
    }
}