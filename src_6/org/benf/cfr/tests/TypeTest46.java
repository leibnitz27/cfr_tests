package org.benf.cfr.tests;

import org.benf.cfr.tests.support.ListFactory;

import java.util.List;

public class TypeTest46 {

    public <T> T test(List<Object> list) {
        return (T)list.get(0);
    }
}
