package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 26/11/2013
 * Time: 13:38
 */
public class InnerClassTest44 {

    protected class Bob {
        protected class Jim {
        }
    }

    public Object test2(InnerClassTest44 other) {
        Bob.Jim bob1 = other.new Bob().new Jim();
        return bob1;
    }
}
