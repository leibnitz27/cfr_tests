package org.benf.cfr.tests;


/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 03/04/2012
 */
public class CastTest9a {

    public void t1() {
        Integer s = 2;
        call(s);
        call((long)s);
        call(s);
        call((long)s);
        call((double)s);
    }

    public void call(long l) {
    }

    public void call(double d) {
    }

}
