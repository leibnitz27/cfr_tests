package org.benf.cfr.tests;


/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 03/04/2012
 */
public class CallTest3b {
    private static class B {
        public void foo() {
            System.out.println("B");
        }
    }

    public static void main(String [] args) {
        B b = new B();
        b.foo();
    }
}
