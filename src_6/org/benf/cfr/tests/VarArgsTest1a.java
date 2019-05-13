package org.benf.cfr.tests;


/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 03/04/2012
 */
public class VarArgsTest1a {

    public void x(int a, Integer ... bs) {
    }

    public void x(int a, int b1, int b2) {
    }

    public void x(int a, int b1, int b2, int b3) {
    }

    public void t() {
        Integer a = 2;
        x(3, a);
        x(3, new Integer[]{a});
    }

}
