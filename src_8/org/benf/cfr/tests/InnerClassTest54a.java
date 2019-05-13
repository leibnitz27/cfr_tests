package org.benf.cfr.tests;

import java.util.function.Function;

public class InnerClassTest54a {
    // CFR doesn't decompile inner class
    static class Mess {
        String a = "hello world";
    }

    public static void main(String[] args) {

        Function<Object, String> f = x -> new Mess().a;
        System.out.println(f.apply(0));
    }

}
