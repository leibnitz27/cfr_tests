package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 23/05/2013
 * Time: 17:59
 */
public class BoxingTest6b {
    private void IntegerF(Integer I) {
        DoubleF((double)I);
        DoubleF(Double.valueOf(I.intValue()));
    }

    private void DoubleF(Double Darg) {
    }

}
