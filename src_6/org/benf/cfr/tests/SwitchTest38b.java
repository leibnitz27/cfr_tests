package org.benf.cfr.tests;

public class SwitchTest38b {
    public static void main(String[] args) {
        switch (args.length) {
            case 0: {
                if (args.hashCode() < 100) {
                    String tmp = "0" + args.length;
                    int zzz = 2;
                    System.out.println(tmp  + zzz);
                } else {
                    String tmp = "0" + args.length;
                    int zzz = 3;
                    System.out.println(tmp  + zzz);
                }
                break;
            }
            case 1: {
                String tmp = "1" + args.length;
                System.out.println(tmp);
            }
        }

    }
}
