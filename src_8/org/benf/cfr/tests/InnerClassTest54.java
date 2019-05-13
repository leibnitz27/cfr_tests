package org.benf.cfr.tests;

import java.util.function.Function;

public class InnerClassTest54 {
    public static void main(String[] args) {
        // CFR doesn't decompile inner class
        class Mess {
            String a = "hello world";
        }

        Function<Object, String> f = x -> new Mess().a;
        System.out.println(f.apply(0));
    }

}
