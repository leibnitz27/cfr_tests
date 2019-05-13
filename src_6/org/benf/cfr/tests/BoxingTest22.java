package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 23/05/2013
 * Time: 17:59
 */
public class BoxingTest22 {
    private void t(boolean b) {
        int i = 4;
        Integer I = 3;
        short s = (short)(b ? I : i);
    }

}
