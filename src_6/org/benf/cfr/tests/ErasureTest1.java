package org.benf.cfr.tests;

public class ErasureTest1<V> {
    public void test(V v) {
        System.out.println(v);
    }

    public static ErasureTest1<String> make() {
        return new ErasureTest1<String>();
    }
}
