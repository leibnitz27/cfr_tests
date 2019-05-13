package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 04/09/2012
 * Time: 07:09
 */
public class InnerClassTest22 {


    public void foo(Inner1.Inner2 y) {
        System.out.println(y.getX(1,2,3));
    }

    public class Inner1 {
    public class Inner2 {
        private int x;

        public void foo() {
            System.out.println(x);
        }

        private int getX(int a, int b, int c) {
            return a+b+c+x;
        }
    }
    }
}
