package org.benf.cfr.tests;

class Crux {

    public static void main(String[] args) {
        new Crux().test(args.length == 0 ? 0 : (byte)1);
    }

    void test(int i) {
        System.out.println("wrong");
    }

    void test(byte b) {
    }

}
