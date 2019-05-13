package org.benf.cfr.tests;

class StringSwitchTest4 {

    public static void main(String[] args) {
        // CFR decompiles as boolean
        int i = 0;
        switch("" + i + i + i + "a") {
            case "1":
                System.out.println("one");
            case "11":
                System.out.println("one");
            case "111":
                System.out.println("one");
            case "2":
                System.out.println("one");
            case "22":
                System.out.println("one");
        }
    }

}