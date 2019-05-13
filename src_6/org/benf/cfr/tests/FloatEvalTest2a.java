package org.benf.cfr.tests;

// Another Abe Crannaford special!
public class FloatEvalTest2a {

    public static void t1(double d) {
        System.out.println(!(d > Double.NaN));
    }

    public static void t2(double d) {
        System.out.println(d <= Double.NaN);
    }

    public static void main(String ... args) {
        t1(3.9);
        t2(3.9);
    }
}
