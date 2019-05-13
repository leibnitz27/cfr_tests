package org.benf.cfr.tests;

class StringSwitchTest2 {

    public static void main(String[] args) {
        // CFR decompiles as boolean
        int i = 0;
        switch(((Long)(i + 1L)) + "a") {
            case "1":
                System.out.println("one");
        }
        switch((i + i + i )+ "a") {
            case "1":
                System.out.println("one");
        }
        switch(i + i + i + "a") {
            case "1":
                System.out.println("one");
        }
        switch("" + i + i + i + "a") {
            case "1":
                System.out.println("one");
        }
        switch((Integer)i + "a") {
            case "1":
                System.out.println("one");
        }
    }

}