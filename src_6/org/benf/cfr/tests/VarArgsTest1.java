package org.benf.cfr.tests;


/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 03/04/2012
 */
public class VarArgsTest1 {

    public void x(int a, Integer ... bs) {
    }

    public void x(int a, Integer b1, int b2) {
    }

    public void t() {
        Integer a = 2;
        int b = 5;
        Integer B = 5;
        x(3, a);
        x(3, new Integer[]{a});
        x(3, a, b);
        x(3, new Integer[]{a,b});
        x(3, a, B);
        x(3, new Integer[]{a,B});
        x(3, a,b,a);
        x(3, new Integer[]{a,b,a});
    }

}
