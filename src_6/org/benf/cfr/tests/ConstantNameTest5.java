package org.benf.cfr.tests;

public strictfp class ConstantNameTest5 {
    static final double dx = Math.PI * 2;
    static final float fx = (float)dx;
    static final float fx4 = fx * 2;
    static final double dx2 = fx;
    static final float fx2 = (float)dx2;
    static final double dfx = dx2 - fx;

    public static void main(String ... args) {
        final double dx = Math.PI * 2;
        final float fx = (float)dx;
        final float fx4 = fx * 2;
        final double dx2 = fx;
        final float fx2 = (float)dx2;
    }
}
