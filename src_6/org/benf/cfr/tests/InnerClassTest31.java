package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 26/11/2013
 * Time: 13:38
 */
public class InnerClassTest31 {

    public int foo() {
        class Bob {
            public Bob mkBok() {
                return new Bob();
            }

            int get() {
                return 1;
            }
        }

        return new Bob().mkBok().get();
    }

}
