package org.benf.cfr.tests;

import java.util.List;

public class LoopTest70 {
    public void foo(int[] lstJsr, String[] x) {

        {
            for (int i : lstJsr) {
                System.out.println(i);
            }
        }
        {
            for (String i : x) {
                System.out.println(i);
            }
        }
    }
}
