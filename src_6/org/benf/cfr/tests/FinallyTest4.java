package org.benf.cfr.tests;

public class FinallyTest4 {
    public void ft1(int x) {
        try {
            if (x == 0) {
                System.out.println("0");
                return;
            }
            if (x < 10) {
                System.out.println("10");
                return;
            }
            if (x < 100) {
                System.out.println("100");
                return;
            }
            if (x < 1000) {
                System.out.println("1000");
                return;
            }
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("HERE");
        }
    }
}
