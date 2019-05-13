package org.benf.cfr.tests;

// Another Abe Crannaford special!
public class FloatEvalTest1 {

    public static void main(String[] args) {
        double d = 1.0;
        // CFR rewrites floating point comparisons, causing wrong output - both should print 'true'
        // see JLS 15.7.3
        System.out.println(!(d < Double.NaN));
    }
}
