package org.benf.cfr.tests;

import org.benf.cfr.tests.support.Pair;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 26/11/2013
 * Time: 13:38
 */
public class InnerClassTest41 {

    protected class Bob {
    }


    public Object test1(InnerClassTest41 other) {
        Bob bob1 = this.new Bob();
        Bob bob2 = other.new Bob();
        return new Pair(bob1, bob2);
    }
}
