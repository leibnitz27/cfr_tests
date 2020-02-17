/*
 * Decompiled with CFR.
 */
package org.benf.cfr.tests;

public class SwitchTest30 {

    public static void foo(String x) {
        System.out.println(switch (x) {
            case "Jennifer" -> throw new IllegalStateException();
            case "Alison","Phillipa" -> {
                System.out.println("JIM");
                yield "JIM";
            }
            case "Sue","Deborah","Annabel" -> "FRED";
            default -> {
                if (x.length() > 4) yield "ALICE";
                System.out.println("BOB!");
                yield "BOB";
            }
        });
    }

    public static void main(String ... args) {
        foo("Jennifer");
        foo("Sue");
        foo("Debbie");
    }
}
