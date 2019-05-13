package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 26/11/2013
 * Time: 13:38
 */
public class InnerClassTest45 {

    protected class Bob {
        public Object test() {
            return new Jim();
        }
    }

    protected class Jim {
    }
}
