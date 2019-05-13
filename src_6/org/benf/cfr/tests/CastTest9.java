package org.benf.cfr.tests;


/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 03/04/2012
 */
public class CastTest9 {

    public void t1() {
        Integer s = 2;
        call(s);
        call((long)s);
        call2(s);
        call2((long)s);
        call2((double)s);
    }

    public void call(long l) {
    }

    public void call2(double d) {
    }

}
