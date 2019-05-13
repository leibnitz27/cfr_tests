package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 26/11/2013
 * Time: 13:38
 */
public class InnerClassTest33 {

    private InnerClassTest33(int x) {
    }

    public class Factory {
        private InnerClassTest33 get(int y) {
            return new InnerClassTest33(y);
        }
    }

}
