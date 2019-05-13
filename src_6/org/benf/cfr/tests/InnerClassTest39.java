package org.benf.cfr.tests;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 26/11/2013
 * Time: 13:38
 */
public class InnerClassTest39 {

    protected class Bob {
    }

    public Object test1() {
        Bob bob1 = this.new Bob();
        return bob1;
    }

    public Object test2() {
        Bob bob1 = new Bob();
        return bob1;
    }
}
