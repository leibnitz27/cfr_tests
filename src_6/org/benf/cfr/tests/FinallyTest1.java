package org.benf.cfr.tests;

public class FinallyTest1 {
    public int ft1(int x) {
        try {
            switch (x) {
                case 1:
                    return 1;
                case 2:
                    return 1;
                case 3:
                    return 1;
                case 4:
                    return 1;
                case 5:
                    return 1;
                case 6:
                    return 1;
                case 7:
                    return 1;
                case 8:
                    return 1;
            }
        } finally {
            System.out.println("HERE");
        }
        return 2;
    }
}
