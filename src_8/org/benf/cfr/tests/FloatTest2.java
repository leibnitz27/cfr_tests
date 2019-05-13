package org.benf.cfr.tests;


public class FloatTest2 {
    public static double dpC(double in) {
        int ini = (int)(in * 10_000);
        double res = ((double)ini) / 10_000;
        return res;
    }

    public static void main(String ... args) {
        System.out.println(dpC(1.23454));
        System.out.println(dpC(1.23455));
        System.out.println(dpC(1.23456));
        System.out.println(dpC(1.23464));
        System.out.println(dpC(1.23465));
        System.out.println(dpC(1.23466));
    }
}
