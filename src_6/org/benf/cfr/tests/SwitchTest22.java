package org.benf.cfr.tests;

public class SwitchTest22 {
    int test(int x) {
        switch (x) {
            case 1:
                return 4;
            case 2:
                return 3;
            case 3:
                return 2;
            case 4:
                return 1;
        }
        System.out.println("Here");
        return 2;
    }
}
