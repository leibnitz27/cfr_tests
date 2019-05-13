package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 23/05/2013
 * Time: 17:59
 */
public class BoxingTest29 {

    private void intFn(Integer i) {
    }

    private void t(Double d) {
        intFn((int)(double)d);
    }
}
