package org.benf.cfr.tests;

public class InstanceOfPatternTestLoop1 {
    static class Tree {
        public Tree l;
        public Tree r;
        public int x;
    }

    int m(Object o) {

        int val = 0;
        while (o instanceof Tree t) {
            o = t.l;
            val += t.x;
        }
        return val;
    }
}
