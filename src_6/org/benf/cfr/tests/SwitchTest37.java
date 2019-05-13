package org.benf.cfr.tests;

public class SwitchTest37 {
    public static void main(String[] args) {
        switch (args.length) {
            case 0: {
                int a = 1;
                String tmp = "0" + args.length;
                int zzz = 2;
                System.out.println(tmp + a + zzz);
            }
            case 1: {
                String tmp = "1" + args.length;
                System.out.println(tmp);
            }
        }

    }
}
