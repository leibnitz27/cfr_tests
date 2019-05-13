package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 23/05/2013
 * Time: 17:59
 */
public class BoxingTest25 {
    private void t(boolean b) {
        Double d = 4.3;
        Integer i = null;
        fn((int)d.doubleValue());
        fn(i.intValue());
    }

    private void fn(Integer i) {
    }

}
