package org.benf.cfr.tests;

import java.util.function.Supplier;

public class Saturn2 {
    public static void main(String[] args) {
        Supplier<Object> c = () -> (((Supplier<Saturn2>)(Saturn2::new))).get();
        System.out.println(c.getClass());
    }
}
