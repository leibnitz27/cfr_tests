package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 13/03/2014
 * Time: 17:15
 */
public class ScopeTest11 {
    StructTest2 y;

    public void foo(StructTest2 structTest1) {
        y = structTest1;
        StructTest2 x = y;
        x.x.a = "fred";
        x = y;
        x.x.b = 3;
        x = y;
        x.x.b = 2;
        x = y;
        x.x.b = 1;

    }
}
