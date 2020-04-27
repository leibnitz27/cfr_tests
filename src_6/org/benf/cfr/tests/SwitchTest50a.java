package org.benf.cfr.tests;

public class SwitchTest50a {
    void test(int e) {
        Label: {
            switch (e) {
                case 3:
                    System.out.println("fred");
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
