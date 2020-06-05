package org.benf.cfr.tests;

public class ArrayTest20 {
    static boolean byteArray = true;

    public static void main(String[] args) {
        Object array = null;
        array = byteArray ? new byte[1] : new boolean[1];
        ((byte[])array)[0] = 0;
        System.out.println(((byte[])array)[0]);
    }
}
