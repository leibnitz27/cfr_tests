package org.benf.cfr.tests;

/*
 * Test courtesy of Abe Crannaford
 */

class Tock {

    public static void main(String[] args) {
        test(0);
    }

    static void test(int num) {
        boolean okay = false;
        try {
            if(num < -1) return;
            switch(num) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                default:
                    System.out.println("default");
                    boolean b = num != 0;
                    if(num != 0) return;
                    System.out.println("(not zero)");
            }
            System.out.println("switched");
            okay = true;
        } finally {
            System.out.println("fin");
            if(okay) System.out.println("a-ok!");
        }
    }

}