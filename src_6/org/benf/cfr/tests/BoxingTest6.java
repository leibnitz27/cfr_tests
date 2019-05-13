package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 23/05/2013
 * Time: 17:59
 */
public class BoxingTest6 {
    private void IntegerF(Integer I) {
        IntegerF(I);
        intF(I);
        doubleF(I);
        DoubleF((double) I);
        ShortF((short) I.intValue());
        shortF((short) I.intValue());
    }

    private void intF(int i) {
        IntegerF(i);
        intF(i);
        doubleF(i);
        DoubleF((double) i);
        ShortF((short) i);
        shortF((short) i);
    }

    private void doubleF(double d) {
        IntegerF((int) d);
        intF((int) d);
        doubleF(d);
        DoubleF(d);
        ShortF((short) d);
        shortF((short) d);
    }

    private void DoubleF(Double D) {
        IntegerF((int) D.doubleValue());
        intF((int) D.doubleValue());
        doubleF(D);
        DoubleF(D);
        ShortF((short) D.doubleValue());
        shortF((short) D.doubleValue());
    }

    private void ShortF(Short S) {
        IntegerF((int) S.shortValue());
        intF(S);
        doubleF(S);
        DoubleF((double) S.shortValue());
        ShortF(S);
        shortF(S);
    }

    private void shortF(short s) {
        IntegerF((int) s);
        intF(s);
        doubleF(s);
        DoubleF((double) s);
        ShortF(s);
        shortF(s);
    }




}
