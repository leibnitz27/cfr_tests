package org.benf.cfr.tests;


/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 03/04/2012
 */
public class VarArgsTest1f {

    public void x(int a, Integer ... bs) {
    }

    public void x(int a, Integer b1, int b2) {
    }

    public void t() {
        Integer a = 2;
        int b = 5;
        x(3, new Integer[]{a,b});
        x(3, a, b);
    }

}
