package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 23/05/2013
 * Time: 17:59
 */
public class BoxingTest2 {
    private boolean t(int i) {
        // be careful you don't unbox ;)
        return Integer.valueOf(i) == null;
    }


}
