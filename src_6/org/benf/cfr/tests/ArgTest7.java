package org.benf.cfr.tests;

import org.benf.cfr.tests.support.SetFactory;

import java.util.Set;

public class ArgTest7 {

    public void fixArgs(Set<Integer> args) {
    }

    public void test() {
        fixArgs(SetFactory.<Integer>newSet());
    }
}
