package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 18/12/2012
 * Time: 07:22
 * <p/>
 * Test that default is lifted inside the switch
 */
public class StrictFPTest2 {

    public double test1(double a, double b) {
        return a+b;
    }

    public strictfp double test2(double a, double b) {
        return a+b;
    }
}
