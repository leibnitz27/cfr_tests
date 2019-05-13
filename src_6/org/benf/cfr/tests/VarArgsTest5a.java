package org.benf.cfr.tests;


/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 03/04/2012
 */
public class VarArgsTest5a {

    public static void x(int a, Object ... bs) {
    }

    public static void x(int a, Object bs) {
    }

    public void t() {
        Integer a = 2;
        Object b = new Object();
        Integer B = 5;
        x(3, a);
    }

}
