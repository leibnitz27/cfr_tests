package org.benf.cfr.tests;

public class ScopeTest12b {

    public static String test(char[] chars) {
        int x = 0;
        int len = chars.length;
        for (x = 0; x < len; ++x) {
            char c = chars[x];
            if (c >= '0' + x) continue; // Note - this x stops the loop being pulled together.
            break;
        }
        return null;
    }
}
