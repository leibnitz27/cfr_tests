package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 23/05/2013
 * Time: 17:59
 */
public class BoxingTest24 {
    private void t(boolean b) {
        Integer i = 3;
        Integer i2 = 3;
        int i3 = 3;
        fn(i.intValue());
        fn(i2);
        fn(i3);
        fn(Integer.valueOf(i3));
    }

    private void fn(Integer i) {
    }

}
