package org.benf.cfr.tests;

public enum EnumTest17 {

    FOO(1,2),
    BAR(1,2,3);


    private EnumTest17(int a, int b) {
        this(a,b,12);
    }

    private EnumTest17(int a, int b, int c) {
        System.out.println(a+b+c);
    }
}
