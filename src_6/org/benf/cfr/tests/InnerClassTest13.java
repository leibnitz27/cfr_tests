package org.benf.cfr.tests;


/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 04/09/2012
 * Time: 07:09
 */
public class InnerClassTest13 {
    private static int a;

    public class Inner1 {
        private int b;

        public class Inner2 {
            public int c;

            public void foo() {
                System.out.println("Res" + (a+b+c));
                int c2 = Inner2.this.c;
                int b2 = Inner1.this.b;
                int a2 = InnerClassTest13.this.a;
                a+=b;
            }

        }

    }
}
