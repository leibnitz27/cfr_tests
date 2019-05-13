package org.benf.cfr.tests;


/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 03/04/2012
 */
public class VarArgsTest3 {

    public VarArgsTest3(int a, Integer ... bs) {
    }

    public VarArgsTest3(int a, Integer b1, int b2) {
    }

    public static void t() {
        Integer a = 2;
        int b = 5;
        Integer B = 5;
        new VarArgsTest3(3, a);
        new VarArgsTest3(3, new Integer[]{a});
        new VarArgsTest3(3, a, b);
        new VarArgsTest3(3, new Integer[]{a,b});
        new VarArgsTest3(3, a, B);
        new VarArgsTest3(3, new Integer[]{a,B});
        new VarArgsTest3(3, a,b,a);
        new VarArgsTest3(3, new Integer[]{a,b,a});
    }

}
