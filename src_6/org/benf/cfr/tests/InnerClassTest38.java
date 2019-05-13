package org.benf.cfr.tests;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 26/11/2013
 * Time: 13:38
 */
public class InnerClassTest38 {

    protected class Bob {
        InnerClassTest38 a;

        private Bob(InnerClassTest38 a, List<String> lst) {
            this.a=a;
        }
    }


}
