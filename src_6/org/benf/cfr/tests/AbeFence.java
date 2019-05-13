package org.benf.cfr.tests;

public class AbeFence {
    public static void main(String[] args) {
        Object o = new Object() {
            // CFR doesn't decompile this
            {
                System.out.println("hello world");
            }
        };
    }
}
