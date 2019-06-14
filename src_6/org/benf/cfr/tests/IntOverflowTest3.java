package org.benf.cfr.tests;

public class IntOverflowTest3 {
    public static void main(String ... args) {
        try {
            int x = Integer.MAX_VALUE;
            x <<= -1;
            x >>= -1;
            System.out.println(x);
        } catch (Exception e) {
            System.out.println("Here.");
        }
    }
}
