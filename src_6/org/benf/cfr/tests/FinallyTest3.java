package org.benf.cfr.tests;

public class FinallyTest3 {
    public int ft1(int x) {
        try {
            System.out.println("THERE");
            switch (x) {
                case 1:
                    return 3;
                case 3:
                    return 2;
            }
        } finally {
            System.out.println("HERE");
        }
        return 2;
    }
}
