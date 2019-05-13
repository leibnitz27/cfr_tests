package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 04/09/2012
 * Time: 07:09
 */
public class InnerClassTest18 {

    private static int x;

    public class Inner1 {

        public void foo() {
            System.out.println(x);
        }

    }
}
