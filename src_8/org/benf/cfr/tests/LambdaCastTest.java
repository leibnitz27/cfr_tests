package org.benf.cfr.tests;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class LambdaCastTest {

    static boolean test(Object o) {
        return o instanceof Runnable && o instanceof Serializable;
    }

    public static void main(String ... args) {
        // cast requires both types
        System.out.println(test((Runnable & Serializable)() -> { System.out.println("A"); }));
        System.out.println(test((Runnable)(Serializable)(Runnable)(() -> { System.out.println("B"); })));
    }

}
