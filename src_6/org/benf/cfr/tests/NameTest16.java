package org.benf.cfr.tests;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class NameTest16 {

    public static class Goto {
        void foo(){
        }
    }

    public int foo(Goto f) {
        Goto g = new Goto();
        f.foo();
        g.foo();
        return 1;
    }
}
