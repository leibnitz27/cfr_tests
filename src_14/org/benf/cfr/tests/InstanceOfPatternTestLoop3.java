package org.benf.cfr.tests;

public class InstanceOfPatternTestLoop3 {
    static class Tree {
        public Tree l;
        public Object label;
        public int x;
    }

    int m(Tree t) {

        int val = 0;
        do {
            val += t.x;
            t = t.l;
        } while (t.label instanceof String s && s.length() > 1);
        return val;
    }
}
