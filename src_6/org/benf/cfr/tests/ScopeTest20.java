package org.benf.cfr.tests;

public class ScopeTest20 {

    public static int foo(boolean b) {
        // severely breaks sugaring
        int x = (new Object[0]).length;
        x = (new Object[0]).length;
        Object[] foo = new Object[0];
        int y = foo.length;
        return x+y;
    }

}
