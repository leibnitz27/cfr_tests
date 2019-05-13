package org.benf.cfr.tests;

class Beyond {

    Object o;

    Beyond() {
        throw new Error();
    }

    static {
        new Beyond().o = new Beyond().o;
    }

    public static void main(String[] args) {
        System.out.println("shouldn't reach here");
    }

}