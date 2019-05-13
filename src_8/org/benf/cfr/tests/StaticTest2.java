package org.benf.cfr.tests;

import org.benf.cfr.tests.support.ListFactory;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 */
public class StaticTest2 {
    private static void inner(List<String> x) {
    }

    public static void outer() {
        // This would not work in java6 - would need <String>
        inner(ListFactory.newList());
        inner(ListFactory.<String>newList());
    }
}
