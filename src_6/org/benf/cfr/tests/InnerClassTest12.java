package org.benf.cfr.tests;


import org.benf.cfr.tests.support.SetFactory;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 04/09/2012
 * Time: 07:09
 */
public class InnerClassTest12 {
    public int a;

    public class Inner1 {
        public int b;

        public class Inner2 {
            public int c;

            public void foo() {
                System.out.println("Res" + (a+b+c));
                int c2 = Inner2.this.c;
                int b2 = Inner1.this.b;
                int a2 = InnerClassTest12.this.a;
            }

        }

    }
}
