/*
 * Decompiled with CFR.
 */
package org.benf.cfr.tests;

public class SwitchTest27 {

    public static void foo(String x) {
        System.out.println(switch (x) {
            case "Jennifer" -> throw new IllegalStateException();
            case "Alison", "Phillipa" -> "JIM";
            case "Sue", "Deborah", "Annabel", "Too" -> "FRED";
            default -> throw new IllegalStateException();
        });
    }

    public static void main(String ... args) {
        foo("Jennifer");
        foo("Sue");
        foo("Debbie");
    }
}
