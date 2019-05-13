package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 26/11/2013
 * Time: 13:38
 */
public class InnerClassTest42 {

    protected class Bob {
    }

    public Object test1() {
        InnerClassTest42 t = this;
        Bob bob1 = t.new Bob();
        return bob1;
    }

    public Object test2() {
        this.getClass();
        Bob bob1 = new Bob();
        return bob1;
    }
}
