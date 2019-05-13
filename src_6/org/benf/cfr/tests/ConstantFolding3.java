package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 03/04/2012
 */
public class ConstantFolding3 {
    public double test1() {
        return 1.01 + 2.02 + 3.03 + 4.04 + 5.05 + 6.06;
    }

    public strictfp double test1b() {
        return 1.01 + 2.02 + 3.03 + 4.04 + 5.05 + 6.06;
    }

    public double test2() {
        return 1.01 + 2.02 + 3.03 + 4.04 + 5.05 + 6.06 / 0;
    }

    public double test3() {
        return 1.01 + 2.02 + 3.03 / 1.32 + 5.05 + 6.06;
    }

    public strictfp double test3b() {
        return 1.01 + 2.02 + 3.03 / 1.32 + 5.05 + 6.06;
    }

    public strictfp double test3c() {
        double a = 1.01;
        double b = 2.02;
        double c = 3.03;
        return a+b+c;
    }

    static final double a = 1.01;
    static final double b = 2.02;
    static final double c = 3.03;

    public double test3dd() {
        return test3d(a,b,c);
    }

    public double test3d(double a, double b, double c) {
        return a+b+c;
    }

    public double test3e() {
        return a+b+c;
    }


    public static void main(String ... args) {
        System.out.println(new ConstantFolding3().test2());
    }

}
