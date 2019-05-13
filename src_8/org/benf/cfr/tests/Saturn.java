package org.benf.cfr.tests;

import java.util.function.Supplier;

public class Saturn {
    public static void main(String[] args) {
        Supplier<Saturn> c = ((Supplier<Saturn>)Saturn::new)::get;
        System.out.println(c.getClass());
    }
}
