package org.benf.cfr.tests;


/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 04/09/2012
 * Time: 07:09
 */
public class InnerClassTest15b {
    private int a;

    public class Inner1 {
        private int b;

        public class Inner2 {
            public int c;

            public void foo() {
                System.out.println("Res" + (a+b+c));
                int c2 = Inner2.this.c;
                ++a;
                a+=2;
            }

        }

    }
}
