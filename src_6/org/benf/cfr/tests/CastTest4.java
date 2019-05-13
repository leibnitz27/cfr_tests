package org.benf.cfr.tests;


/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 03/04/2012
 */
public class CastTest4 {

    public void t1() {
        long x = 2;
        call(x);
        call((int)x);
        call((byte)x);
        call((short)x);
    }

    public void call(long l) {
    }

    public void call(short s) {
    }

}
