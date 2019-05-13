package org.benf.cfr.tests;

public class FloatEvalTest3a {
    public boolean doTestNan1b(double a, double b, double c) {
        return (!(a<b) || !(c>a));
    }
}
