package org.benf.cfr.tests;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 26/11/2013
 * Time: 13:38
 */
public class InnerClassTest36 {


    public static int foo(List<String> list) {

        class Bob {
            private Bob(List<String> lst) {
            }

            private int get() {
                return 1;
            }
        }

        return new Bob(list).get();
    }

    public int foo2(List<String> list) {

        strictfp class Bob {
            private Bob(List<String> lst) {
            }

            private int get() {
                return 1;
            }
        }

        return new Bob(list).get();
    }

}
