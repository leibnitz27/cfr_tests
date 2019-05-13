package org.benf.cfr.tests;

import java.util.List;

public class LoopTest68 {
    public void foo(List<Integer> lstJsr) {
        for (int i = 0; i < lstJsr.size(); i++) {
            for (int j = i + 1; j < lstJsr.size(); j++) {
                System.out.println(lstJsr.get(i) + lstJsr.get(j));
            }
        }
    }
}
