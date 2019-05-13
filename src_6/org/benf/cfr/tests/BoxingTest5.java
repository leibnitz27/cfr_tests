package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 23/05/2013
 * Time: 17:59
 */
public class BoxingTest5 {
    private boolean t(Integer f) {
        try {
            if (Integer.valueOf(f) == null) return false;
            return false;
        } catch (NullPointerException e) {
            return true;
        }
    }


}
