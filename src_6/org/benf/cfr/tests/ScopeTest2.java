package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 */
public class ScopeTest2 {
    public int x;

    public void foo(int y) {
        x = y;
    }

    public void foo2(int x) {
        this.x = x;
    }

    private class Inner {

        int x;
        int y;
        ScopeTest2 scopeTest2;

        public Inner() {
            scopeTest2 = ScopeTest2.this;
            this.y = x;
            this.y = ScopeTest2.this.x;
        }


        public void foo() {
            this.x = 3;
        }

        public void bar() {
            scopeTest2 = ScopeTest2.this;
            this.x = ScopeTest2.this.x;
        }
    }
}
