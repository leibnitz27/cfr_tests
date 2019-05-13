package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 23/05/2013
 * Time: 17:59
 */
public class BoxingTest6a {
    private void IntegerF(Integer I) {
        doubleF(I);
        DoubleF((double) I.intValue());
    }

    private void doubleF(double darg) {
    }

    private void DoubleF(Double Darg) {
    }

}
