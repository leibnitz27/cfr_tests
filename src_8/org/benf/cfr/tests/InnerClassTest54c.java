package org.benf.cfr.tests;

import java.util.function.Function;

public class InnerClassTest54c {
    public void foo(String[] args) {
        // CFR doesn't decompile inner class
        Function<Object, String> f = x -> {
            class Mess {
                String a = "hello world";
            }

            return new Mess().a;
        };
        System.out.println(f.apply(0));
    }

}
