package org.benf.cfr.tests;

interface Intent {

    // CFR misses cast to Intent
    int i = ((Intent)() -> {
        System.out.println("hi");
        return 1;
    }).num();

    public static void main(String[] args) {

    }

    int num();

}
