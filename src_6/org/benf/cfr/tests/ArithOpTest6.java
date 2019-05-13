package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 11/03/2014
 * Time: 18:07
 */
public class ArithOpTest6 {
    long nextIdx = 0;

    public Long getNextIdent(long slot) {
        return new Long(nextIdx++);
    }

    public Long getPrevIdent(long slot) {
        return new Long(nextIdx--);
    }

    public long getNextIdent() {
        return nextIdx++;
    }

    public long getPrevIdent() {
        return nextIdx--;
    }
}
