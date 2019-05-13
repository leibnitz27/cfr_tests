package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 13/03/2014
 * Time: 17:15
 */
public class ScopeTest10 {
    public void foo(StructTest2 structTest1) {
        StructTest2 x = null;
        try {
            x = structTest1;
            x.x.a = "fred";
            x = structTest1;
            x.x.b = 3;
            x = structTest1;
            x.x.b = 2;
            x = structTest1;
        } catch (Exception e) {
            x.x.b = 1;
        }

    }
}
