package org.benf.cfr.tests;

import org.benf.cfr.tests.support.SetFactory;

import java.util.Set;

public class ArgTest8 {
    public void test(int a, double[] b) {
        if (b.length == 3) {
            System.out.print(1);
            a = 12;
        }
        if (b == null) {
            a = 3;
        }
        System.out.println("A : "+a);
    }
}
