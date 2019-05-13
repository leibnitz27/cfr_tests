package org.benf.cfr.tests;

public class SwitchTest35b {
    public static void main(String[] args) {
        String tmp;
        switch (args.length) {
            case 0: {
                tmp = "0" + args.length;
                System.out.println(tmp);
            }
            case 1: {
                tmp = "1" + args.length;
                System.out.println(tmp);
                break;
            }
            case 2: {
                System.out.println("Foo");
            }
        }

    }
}
