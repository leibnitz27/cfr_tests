package org.benf.cfr.tests;

public class BridgeTest1c {
    // Simple test which generates a bridge method
    public static class A<T> {
        public Object getT(T t) {
            return null;
        }
    }
    public static class  B extends A<String> {
        public Object getT(String s) {
            return null;
        }
    }

    public static void main(String ... args) {
        B b = new B();
        b.getT("hello");
        A<String> a1 = b;
        a1.getT("hello");
        A a2 = b;
        a2.getT("hello");
    }
}
