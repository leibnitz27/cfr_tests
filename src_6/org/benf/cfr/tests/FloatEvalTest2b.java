package org.benf.cfr.tests;

// Another Abe Crannaford special!
public class FloatEvalTest2b {

    public static void t1(double d, double c) {
        System.out.println(!(d > c));
    }

    public static void t2(double d, double c) {
        System.out.println(d <= c);
    }

    public static void main(String ... args) {
        t1(3.9, 1.2);
        t2(3.9, 1.2);
        t1(3.9, Double.NaN);
        t2(3.9, Double.NaN);
        t1(Double.NaN, 1.2);
        t2(Double.NaN, 1.2);
    }
}
