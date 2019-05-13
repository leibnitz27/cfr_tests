package org.benf.cfr.tests;


/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 03/04/2012
 */
public class CastTest10 {

    public void t1() {
        int s = 2;
        call(s);
        call((short)s);
    }

    public void call(Number n) {
    }

    public void call(short d) {
    }

}
