package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class PoisonedNameTable {

    public void test() {
        System.out.println("Foo");
    }

    public PoisonedNameTable(int a) {
        int free = a+1;
        int fred = a+3;
        int fref = a+5;
        System.out.println("" + free + "," + fred + "," + fref);
    }

}
