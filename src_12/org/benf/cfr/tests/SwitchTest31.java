/*
 * Decompiled with CFR.
 */
package org.benf.cfr.tests;

public class SwitchTest31 {
    // This is ok to "Accidentally" resugar
    public static void foo(String x) {
        String string;
        switch (x) {
            case "Jennifer": {
                throw new IllegalStateException();
            }
            case "Alison":
            case "Phillipa": {
                System.out.println("JIM");
                string = "JIM";
                break;
            }
            case "Sue":
            case "Deborah":
            case "Annabel": {
                string = "FRED";
                break;
            }
            default: {
                if (x.length() > 4) {
                    string = "ALICE";
                    break;
                }
                System.out.println("BOB!");
                string = "BOB";
            }
        }
        System.out.println(string);
    }

    public static void main(String ... args) {
        foo("Jennifer");
        foo("Sue");
        foo("Debbie");
    }
}
