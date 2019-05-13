package org.benf.cfr.tests;

import java.util.List;

public class LoopTest69 {
    // TODO : This is currently not correct. (0.140)
    public void foo(Integer[] lstJsr, int[] x) {

        {
            for (Integer i : lstJsr) {
                System.out.println(i);
            }
        }
        {
            for (int i : x) {
                System.out.println(i);
            }
        }
    }
}
