package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 */
public class ScopeTest4 {
    int x;
    private static int y;

    public void foo(int y) {
        x = y;
        ScopeTest4.y = y;
    }

    public void foo2(int x) {
        this.x = x;
        y = x;
    }

    private class Inner {
        private int x;

        public Inner() {
            System.out.println(x);
            System.out.println(y);
        }
    }
}
