package org.benf.cfr.tests;

public class SwitchTest48b {
    void test(String x) {
        String string = x;
        int n = -1;
        switch (string.hashCode()) {
            case 69798: {
                if (!string.equals("FOO")) break;
                n = 0;
                break;
            }
            case 65523: {
                if (!string.equals("BAR")) break;
                n = 1;
            }
        }
        switch (n) {
            case 0: {
                System.out.println("here" + n);
                break;
            }
            case 1: {
                System.out.println("there");
                break;
            }
            default: {
                System.out.println("everywhere");
            }
        }
    }}
