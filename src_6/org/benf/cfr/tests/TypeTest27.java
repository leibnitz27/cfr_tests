package org.benf.cfr.tests;

public class TypeTest27 {

    void f(int x, short y) {
    }

    void f(short x, short y) {
    }

    void f(short x, int y) {
    }

    void f(int x, int y) {
    }

    void f(short x, int y, int z) {
    }

    void f(double x, int y, short z) {
    }

    void f(double x, int y, char z) {
    }


    void f(double x, int y, double z) {
    }

    void test(int i, short s, int i2, char c) {
        f(i, s);
        f((int)s, s);
        f((short)i, (short)s);
        f(i, (int)s);
        f((double)i, i, c);
        f((double)i, i, (short)c);
        f((double)i, i, (int)s);
        f((double)i, c, s);
        f((double)i, (short)i, s);
    }

}
