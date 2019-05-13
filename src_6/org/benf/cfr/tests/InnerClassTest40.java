package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 26/11/2013
 * Time: 13:38
 */
public class InnerClassTest40 {

    protected class Bob {
    }

    public Object test2(InnerClassTest40 other) {
        Bob bob1 = other.new Bob();
        return bob1;
    }
}
