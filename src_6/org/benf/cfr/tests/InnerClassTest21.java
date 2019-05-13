package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 04/09/2012
 * Time: 07:09
 */
public class InnerClassTest21 {


    public void foo(Inner2 y) {
        System.out.println(y.x);
    }

    public class Inner2 {
        private int x;

        public void foo() {
            System.out.println(x);
        }

    }
}
