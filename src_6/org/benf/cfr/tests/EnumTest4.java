package org.benf.cfr.tests;


import org.benf.cfr.tests.support.MapFactory;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 22/08/2012
 * Time: 20:58
 */
enum EnumTest4 {
    FOO{ public void f() { System.out.println("FOO!");} },
    BAR{ public void f() { System.out.println("FOO TOO!");} };

    public abstract void f();
}
