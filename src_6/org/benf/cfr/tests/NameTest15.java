package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class NameTest15 {

    private static class Goto {
        void foo(){
        }
    }

    public int foo(Goto f) {
        f.foo();
        return 1;
    }
}
