package org.benf.cfr.tests;


/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 03/04/2012
 */
public class VarArgsTest6b {

    public static void x(int a, Object ... bs) {
    }

    public static void x(int a, Integer bs) {
    }

    public void t() {
        Integer B = 5;
        x(3, (Object)B);
        x(3, B);
    }

}
