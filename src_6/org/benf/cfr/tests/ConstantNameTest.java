package org.benf.cfr.tests;

public class ConstantNameTest {
    public boolean testNan(double d) {
        return Double.isNaN(Double.NaN);
    }

    public boolean testNan(float f) {
        return Float.isNaN(Float.NaN);
    }

    public boolean testNan(double d, float f) {
        return Double.isNaN(Float.NaN);
    }

    public void test() {
        double d = Double.MAX_VALUE;
        double d2 = Double.MIN_NORMAL;
        double d3 = Double.MIN_VALUE;
        double d4 = Double.POSITIVE_INFINITY;
        double d5 = Double.NEGATIVE_INFINITY;
        System.out.println(d + " " + d2 + " " + d3 + " " + d4 + " " + d5);
    }

    public void testf() {
        float d = Float.MAX_VALUE;
        float d2 = Float.MIN_NORMAL;
        float d3 = Float.MIN_VALUE;
        float d4 = Float.POSITIVE_INFINITY;
        float d5 = Float.NEGATIVE_INFINITY;
        System.out.println(d + " " + d2 + " " + d3 + " " + d4 + " " + d5);
    }
}
