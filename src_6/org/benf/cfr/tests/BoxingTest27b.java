package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 23/05/2013
 * Time: 17:59
 */
public class BoxingTest27b {
    private void t(short s) {
        fn(s);
    }

    private void fn(long i) {
    }

    private void fn(Number n) {
    }

}
