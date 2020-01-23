package org.benf.cfr.tests;

import java.util.ArrayList;
import java.util.List;

// Todo!
class AnnotationTestM1b {
    public List test() {
        List<Integer> f2 = new ArrayList<Integer>();
        f2.add((@MyParam3 Integer)1);
        return f2;
    }
}