package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 12/02/2014
 * Time: 17:56
 */
public class PrecedenceTest3 {

    public boolean test1(boolean a, boolean b, boolean c, boolean d) {
        return a ? b : b ? c : d;
    }

    public boolean test2(boolean a, boolean b, boolean c, boolean d) {
        return (a ? b : b) ? c : d;
    }

    public boolean test3(boolean a, boolean b, boolean c, boolean d) {
        return a ? b : (b ? c : d);
    }
}
