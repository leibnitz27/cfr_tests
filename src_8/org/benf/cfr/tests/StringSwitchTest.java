package org.benf.cfr.tests;

class StringSwitchTest {

    public static void main(String[] args) {
        // CFR decompiles as boolean
        int i = 0;
        switch(((Long)(i + 1L)) + "") {
            case "1":
                System.out.println("one");
        }
    }

}