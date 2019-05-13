package org.benf.cfr.tests;

public class CastTest15 {

    static byte a = 1;

    public static void foo() {
        byte b = (byte)(a^1);
        char c = (char)a;
    }
}
