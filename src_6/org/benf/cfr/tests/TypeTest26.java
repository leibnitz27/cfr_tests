package org.benf.cfr.tests;

public class TypeTest26 {



    void test(A a, short s, int i) {
        a.f1(s);
        a.f1((int)s);
        a.f1(i);
        a.f1((short)i);
    }

    public static class A {
        public void f1(short s) {
        }

        public void f1(int i) {
        }
    }
}
