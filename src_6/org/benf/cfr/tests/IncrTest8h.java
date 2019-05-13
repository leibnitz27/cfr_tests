package org.benf.cfr.tests;

public abstract class IncrTest8h {

    static void foo(int ... ints) {}

    public static void main(String ... args) {

        int i;
        i = 1;
        foo(i++,i);
        i=1;
        foo(++i,i);
        i = 1;
        foo(i,i++,i);
        i=1;
        foo(i,++i,i);
        i = 1;
        foo(i,i,i++,i);
        i=1;
        foo(i,i,++i,i);
    }
}
