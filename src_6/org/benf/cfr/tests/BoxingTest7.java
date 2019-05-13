package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 23/05/2013
 * Time: 17:59
 */
public class BoxingTest7 {
    private boolean t(Integer i, int j) {
        // If j is too big for the boxing cache, this will create a new object,
        // therefore the first test will FAIL even though i==j.
        // Unless it's incorrectly decompiled to i==j ;)
        return (i == Integer.valueOf(j) && i == j);
    }


}
