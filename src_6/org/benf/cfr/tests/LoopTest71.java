package org.benf.cfr.tests;

public class LoopTest71 {
    public void foo(int[] lstJsr, String[] x) {
        {
            for (String i : x) {
                System.out.println(i);
            }
        }

        {
            for (int i : lstJsr) {
                System.out.println(i);
            }
        }
    }
}
