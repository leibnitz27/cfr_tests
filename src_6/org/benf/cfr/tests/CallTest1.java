package org.benf.cfr.tests;


import org.benf.cfr.tests.support.Logger;
import org.benf.cfr.tests.support.LoggerFactory;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 03/04/2012
 */
public class CallTest1 {
    private static class A {
        void foo() {
            System.out.println("A");
        }
    }

    private static class B extends A {
        void foo() {
            System.out.println("B");
        }
    }

    public static void main(String [] args) {
        B b = new B();
        b.foo();
        ((A)b).foo();   // Obviously, calls virtual.... ;)

    }
}
