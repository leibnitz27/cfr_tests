package org.benf.cfr.tests;

class Crux2 {

    public static void main(String[] args) {
        new Crux2().test((byte)1);
        new Crux2().test(1);
    }

    void test(int i) {
        System.out.println("wrong");
    }

    void test(byte b) {
    }

}
