package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 23/05/2013
 * Time: 17:59
 */
public class BoxingTest20 {
    private void t(boolean b) {
        Double d = 4.3;
        Integer i = 3;
        short s = (short)(b ? i : (int)Integer.valueOf((int)d.doubleValue()));
    }

}
