package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 26/11/2013
 * Time: 13:38
 */
public class InnerClassTest32 {

    private class Bob {
        private int get() {
            return 1;
        }
    }

    public int foo() {
        return new Bob().get();
    }

}
