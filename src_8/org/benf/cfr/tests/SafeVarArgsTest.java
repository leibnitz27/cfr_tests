package org.benf.cfr.tests;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 23/05/2013
 * Time: 17:59
 */
public class SafeVarArgsTest {
    @SafeVarargs
    public final void test(List<String>... lists) {
    }

    void foo() {
        test(new ArrayList<String>(), new LinkedList<String>());
    }
}
