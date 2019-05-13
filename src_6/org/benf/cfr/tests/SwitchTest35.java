package org.benf.cfr.tests;

public class SwitchTest35 {
    public static void main(String[] args) {
        switch (args.length) {
            case 0: {
                String tmp = "0" + args.length;
                System.out.println(tmp);
            }
            case 1: {
                String tmp = "1" + args.length;
                System.out.println(tmp);
            }
        }

    }
}
