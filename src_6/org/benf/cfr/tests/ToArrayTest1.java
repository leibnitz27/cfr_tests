package org.benf.cfr.tests;

import java.util.List;

public class ToArrayTest1 {

    ToArrayTest1[] foo(List<ToArrayTest1> l) {
        ToArrayTest1[] tmp = new ToArrayTest1[0];
        return l.toArray(tmp);
    }
}
