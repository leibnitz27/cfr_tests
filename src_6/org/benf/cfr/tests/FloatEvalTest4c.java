package org.benf.cfr.tests;

public class FloatEvalTest4c {
    public static boolean test1(double a, double b) {
        return !(a != b);
    }

    public static boolean test2(double a, double b) {
        return (a == b);
    }

    public static void test(double a, double b) {
        System.out.println(a + " vs " + b + ":" + test1(a,b) + "," + test2(a,b));
    }

    public static void main(String ... args) {
        test(1,2);
        test(2,1);
        test(1,1);
        test(Double.NaN, 1);
        test(1, Double.NaN);
    }
}
