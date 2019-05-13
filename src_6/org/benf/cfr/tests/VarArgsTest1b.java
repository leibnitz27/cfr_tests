package org.benf.cfr.tests;


/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 03/04/2012
 */
public class VarArgsTest1b {

    public void x(int a, Object ... bs) {
    }

    public void x(int a, String b1, String b2) {
    }

    public void t() {
        x(3,"a",3);
    }

}
