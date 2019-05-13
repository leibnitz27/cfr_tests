package org.benf.cfr.tests;

import org.benf.cfr.tests.support.SetFactory;

import java.util.Map;
import java.util.Set;

public class TypeTest42 {

    public void test2(Set<String> strings) {
    }

    // While legal java 7, java 6 would have to have an explicit type on the newSet.
    public void test() {
        test2(SetFactory.newSet());
    }
}
