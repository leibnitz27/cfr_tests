package org.benf.cfr.tests;

public class SwitchTest50b {
    void test(int e) {
        Label: {
            switch (e) {
                case 3:
                case 4:
                    if (e == 3) break;
                    System.out.println("fred");
                    if (e == 4) break Label;
                    break;
                case 5:
                    System.out.println("jim");
                    break Label;
            }

            System.out.println("bob");
        }

        System.out.println("alan");
    }
}
