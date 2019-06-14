package org.benf.cfr.tests;

public class IntOverflowTest2 {
    public static void main(String ... args) {
        try {
            int x = Integer.MAX_VALUE;
            x /= 0;
            System.out.println(x);
        } catch (Exception e) {
            System.out.println("Div 0");
        }
    }
}
