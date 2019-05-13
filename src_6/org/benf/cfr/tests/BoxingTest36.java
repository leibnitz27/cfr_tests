package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 23/05/2013
 * Time: 17:59
 */
public class BoxingTest36 {
    private void t(boolean b) {
        Integer i = new Integer(12);
        fn(i, (int)i);
    }

    private boolean fn(Integer i2, Integer i1) {
        return i1 == i2;
    }

}
