package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 26/11/2013
 * Time: 13:38
 */
public class InnerClassTest27 {
    int y;

    public void foo(Integer i) {
        class Integer {
            private final java.lang.Integer inner;

            Integer(java.lang.Integer inner) {
                this.inner = inner;
            }
        }

        Integer i1 = new Integer(i);
        Integer i2 = new Integer(2);
        java.lang.Integer i3 = i+1;
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

    }
}
