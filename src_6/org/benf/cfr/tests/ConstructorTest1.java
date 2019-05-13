package org.benf.cfr.tests;

public class ConstructorTest1 {

    public boolean test(final int x) {
        boolean a = true;
        throw new UnsupportedOperationException( "" + (((a=false)? 3 : 1)));
    }
}
