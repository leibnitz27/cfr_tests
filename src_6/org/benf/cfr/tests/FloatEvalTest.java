package org.benf.cfr.tests;

// Another Abe Crannaford special!
public class FloatEvalTest {

    public static void main(String[] args) {
        double d = 1.0;
        float f = 1.0f;
        // CFR rewrites floating point comparisons, causing wrong output - both should print 'true'
        // see JLS 15.7.3
        System.out.println(!(d < Double.NaN));
        System.out.println(!(f >= Float.NaN));
    }
}
