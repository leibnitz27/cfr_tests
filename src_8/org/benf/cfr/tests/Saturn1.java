package org.benf.cfr.tests;

import java.util.function.Supplier;

public class Saturn1 {
    public static void main(String[] args) {
        Supplier<Saturn1> c = Saturn1::new;
        Supplier<Saturn1> d = c::get;
        System.out.println(d.getClass());
    }
}
