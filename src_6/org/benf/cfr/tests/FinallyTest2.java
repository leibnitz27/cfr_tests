package org.benf.cfr.tests;

public class FinallyTest2 {
    public void ft1(int x) {
        try {
            switch (x) {
                case 1:
                    System.out.println("ONE");
                    return;
                case 2:
                    System.out.println("TWO");
                    return;
                case 3:
                    System.out.println("THREE");
                    return;
                case 4:
                    System.out.println("FOUR");
                    return;
            }
        } finally {
            System.out.println("HERE");
        }
    }
}
