package org.benf.cfr.tests;

public class FloatEvalTest3 {
    public boolean doTestNan1(double a, double b, double c) {
        return (a>=b || c<=a);
    }

    public boolean doTestNan1a(double a, double b, double c) {
        return (a>=b || !(c>a));
    }

    public boolean doTestNan1b(double a, double b, double c) {
        return (!(a<b) || !(c>a));
    }

    public boolean doTestNan1c(double a, double b, double c) {
        return (a>=b && !(c>a));
    }

    public boolean doTestNan1d(double a, double b, double c) {
        return (!(a<b) && !(c>a));
    }

    public boolean doTestNan2a(double a, double b, double c) {
        return (!(a<b) ? !(c>a) : c<=a);
    }

    public boolean doTestNan2b(double a, double b, double c) {
        return (!(a<b) ? c<=a: !(c>a));
    }

    public boolean doTestNan2c(double a, double b, double c) {
        return (!(a<=b) ? c<=a: !(c>a));
    }

    public boolean doTestNan2d(double a, double b, double c) {
        return (a<=b ? c<=a: !(c>a));
    }

    public boolean doTestNan2e(double a, double b, double c) {
        return (a<=b ? c<=a: !(c>a)) && !(a < b+c);
    }

}
