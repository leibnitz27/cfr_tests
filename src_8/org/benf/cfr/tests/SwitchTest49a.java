package org.benf.cfr.tests;

public class SwitchTest49a {
    void test(String x) {
        String string = x;
        int n = -1;
        try {
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
                    System.out.println("here");
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
        } catch (Exception ex) {
            System.out.println(n);
        }
    }
}
