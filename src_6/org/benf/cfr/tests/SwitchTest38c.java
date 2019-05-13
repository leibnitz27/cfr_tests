package org.benf.cfr.tests;

public class SwitchTest38c {
    public static void main(String[] args) {

        if (args.hashCode() < 100) {
            String tmp = "0" + args.length;
            int zzz = 2;
            System.out.println(tmp  + zzz);
            return;
        } else {
            String tmp = "0" + args.length;
            int zzz = 3;
            System.out.println(tmp  + zzz);
            return;
        }

    }
}
