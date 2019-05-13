package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 11/03/2014
 * Time: 18:07
 */
public class ArithOpTest5a {
    int nextIdx = 0;

    public Integer getNextIdent(int slot) {
        return new Integer(nextIdx++);
    }
}
