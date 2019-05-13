package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 26/11/2013
 * Time: 13:38
 */
public class InnerClassTest43 {

    protected class Bob {
    }

    private void foo(Object ... args) {
    }

    public void test2(InnerClassTest43 other) {
        foo(other.new Bob(),other.new Bob(),other.new Bob(),other.new Bob());
    }
}
