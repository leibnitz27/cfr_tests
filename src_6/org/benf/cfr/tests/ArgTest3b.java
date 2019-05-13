package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 18/12/2012
 * Time: 07:22
 * <p/>
 * Test that default is lifted inside the switch
 */
public class ArgTest3b {

    public void test2(int a, int b, double c, int d) {
        c++;
        if (c++ > b) {
            System.out.println("A\n\t\b" + a + b +c + d);
        }
        if (c < a) {
            System.out.println("A\n\t" + a + "\t" + b + "\b" + c + d);
        }
    }

}
