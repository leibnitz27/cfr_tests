package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 26/11/2013
 * Time: 13:38
 */
public class InnerClassTest34 {

    private InnerClassTest34(int x) {
    }

    public static class Factory {
        private InnerClassTest34 get(int y) {
            return new InnerClassTest34(y);
        }
    }

}
