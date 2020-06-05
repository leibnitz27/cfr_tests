package org.benf.cfr.tests;

public class ArrayTest21 {
    static boolean byteArray = true;

    public static void main(String[] args) {
        Object[] array = null;
        array = byteArray ? new Byte[1] : new Boolean[1];
        ((Byte[])array)[0] = 0;
        System.out.println(((Byte[])array)[0]);
    }
}
