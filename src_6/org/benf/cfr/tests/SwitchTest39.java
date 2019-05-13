package org.benf.cfr.tests;

public class SwitchTest39 {
    public static void main(String[] args) {
        switch (args.length) {
            case 0:
                if (args.hashCode() < 100) {
                    String tmp = "0" + args.length;
                    int zzz = 2;
                    System.out.println(tmp  + zzz);
                } else if (args.hashCode() < 200 ){
                    String tmp = "0" + args.length;
                    int zzz = 3;
                    System.out.println(tmp  + zzz);
                } else {
                    String tmp = "0" + args.length;
                    int zzz = 4;
                    System.out.println(tmp  + zzz);
                }
                System.out.println("HERE");
                break;
            case 1: {
                String tmp = "0" + args.length;
                int zzz = 4;
                System.out.println(tmp  + zzz);
                break;
            }
        }

    }
}
