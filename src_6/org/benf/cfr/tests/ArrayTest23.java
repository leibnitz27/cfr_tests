package org.benf.cfr.tests;

public class ArrayTest23 {
    public void foo() {
        try {
            String[] tmp = new String[-5];
            System.out.println("I will never be reached.");
        } catch (Exception e) {
            System.out.println("I will always be reached.");
        }

    }
}
