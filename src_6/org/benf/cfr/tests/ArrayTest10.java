package org.benf.cfr.tests;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 06:28
 * To change this template use File | Settings | File Templates.
 */
public class ArrayTest10 {

    private static class CA {
    }

    private static class CB extends CA {
    }

    private static class CC extends CA {
    }

    void test3() {
        CA[] a;
        a = new CB[4];
        a = new CC[4];
    }

}
