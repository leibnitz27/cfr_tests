package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 23/05/2013
 * Time: 17:59
 */
public class BoxingTest30 {

    private void intFn(Integer i) {
    }

    private void t(Double d) {
        Integer i1 = (int)(double)d;
    }
}
