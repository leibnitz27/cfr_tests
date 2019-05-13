package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 17/08/2012
 * Time: 13:20
 */
public class DoubleTest2 {

    public static void main(String[] args) {
        // And this, boys and girls is why NO.
        double a = 1.23+4.56;
        double b = 5.79;
        System.out.println(Double.compare(a,b));

        float f = 110224.7728308591f;
        double d = 110224.7728308591;
        double d2 = (double)(float)d;
        System.out.println("" + f + ", " + d2 + "," + (float)d + "," + d);

    }
}
