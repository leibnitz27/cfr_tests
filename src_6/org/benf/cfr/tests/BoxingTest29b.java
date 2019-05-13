package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 23/05/2013
 * Time: 17:59
 */
public class BoxingTest29b {

    private void intFn(Integer i) {
    }

    private void t(double d) {
        intFn((Integer)(int)d);
    }
}
