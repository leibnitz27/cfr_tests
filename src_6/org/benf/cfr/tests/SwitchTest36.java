package org.benf.cfr.tests;

public class SwitchTest36 {
    public static void main(String[] args) {
        switch (args.length) {
            default: {
                String tmp = "0" + args.length;
                System.out.println(tmp);
            }
        }

    }
}
