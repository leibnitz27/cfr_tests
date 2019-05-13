package org.benf.cfr.tests;

import org.benf.cfr.tests.support.ListFactory;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 */
public class StaticTest3 {
    private StaticTest3(List<String> x) {
    }

    public static StaticTest3 outer() {
        // This would not work in java6 - would need <String>
        return new StaticTest3(ListFactory.<String>newList());
    }
}
