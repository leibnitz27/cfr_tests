package org.benf.cfr.tests;

public class IntOverflowTest {
    public static void main(String ... args) {
        try {
            int x = Integer.MAX_VALUE;
            x += 4;
            System.out.println(x);
        } catch (Exception e) {
            System.out.println("Overflow");
        }
    }
}
