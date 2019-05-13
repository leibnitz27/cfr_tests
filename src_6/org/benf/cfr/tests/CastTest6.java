package org.benf.cfr.tests;


/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 03/04/2012
 */
public class CastTest6 {

    public void t1() {
        short s = 2;
        call(s);
        call((int)s);
        call((long)s);
    }

    public void call(long l) {
    }

    public void call(int i) {
    }

}
