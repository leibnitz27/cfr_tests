package org.benf.cfr.tests;

public class PrimitivePatterns4b {

    static String mixedSwitch(int obj, int n, int n2) {
        String res;
        switch (obj) {
            case Integer i when i > n: {
                res = "bigger than n2";
                break;
            }
            case int i when i > n2: {
                res = "bigger than n";
                break;
            }
            case Integer i when (n < 100 && n2 > 300) && i > 500: {
                res = "very large int";
                break;
            }
            default: {
                res = "other";
                break;
            }
        }
        return res;
    }

}
