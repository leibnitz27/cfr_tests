package org.benf.cfr.tests;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 26/11/2013
 * Time: 13:38
 */
public class InnerClassTest37 {

    private static class Bob {
        InnerClassTest37 a;

        private Bob(InnerClassTest37 a, List<String> lst) {
            this.a=a;
        }

        private int get() {
            return 1;
        }
    }

    public static int foo(InnerClassTest37 a, List<String> list) {
        return new Bob(a, list).get();
    }

}
