package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 23/05/2013
 * Time: 17:59
 */
public class BoxingTest26a {
    private void t(boolean b) {
        int i3 = 3;
        fn(Integer.valueOf(i3));
    }

    private void fn(Integer i) {
    }

    private void fn(int i) {
    }

}
