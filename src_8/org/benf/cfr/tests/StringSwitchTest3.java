package org.benf.cfr.tests;

class StringSwitchTest3 {

    public static void main(String[] args) {
        // CFR decompiles as boolean
        int i = 0;
        switch("" + i + i + i + "a") {
            case "1":
                System.out.println("one");
        }
    }

}