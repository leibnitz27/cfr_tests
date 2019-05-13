package org.benf.cfr.tests;

import java.util.List;

public class AnnotationTestCode7c {
    public List<Object[][][]> test(boolean b) {
        @AnnotationCode(name="a") List<@AnnotationCode(name="b") Object @AnnotationCode(name="c")[] @AnnotationCode(name="d")[] @AnnotationCode(name="e")[]> var = test();
        @AnnotationCode(name="d") List<@AnnotationCode(name="e") Object @AnnotationCode(name="f")[] @AnnotationCode(name="g")[] @AnnotationCode(name="h")[]> var2 = test();
        List<Object[][][]> res = b ? var : var2;
        return res;
    }

    public List<Object[][][]> test() {
        return null;
    }
}
