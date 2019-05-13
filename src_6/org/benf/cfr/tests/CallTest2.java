package org.benf.cfr.tests;


/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 03/04/2012
 */
public class CallTest2 {
    private static class A {
        void foo() {
            System.out.println("A");
        }
    }

    public static class B extends A {
        public void foo() {
            System.out.println("B");
        }
    }

    public static void main(String [] args) {
        B b = new B();
        b.foo();
        ((A)b).foo();   // Obviously, calls virtual.... ;)

    }
}
