package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 23/05/2013
 * Time: 17:59
 */
public class BoxingTest19 {
    private void t(boolean b) {
        Double d = 4.3;
        int i = 2;
        short s = (short)(b ? i : d);
    }

}
