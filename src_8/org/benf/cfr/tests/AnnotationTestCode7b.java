package org.benf.cfr.tests;

import org.benf.cfr.tests.support.ListFactory;

import java.util.List;

public class AnnotationTestCode7b {
    public void test(AnnotationNested n) {
        @AnnotationCode(name="a") List<@AnnotationCode(name="b") Object @AnnotationCode(name="c")[] @AnnotationCode(name="d")[] @AnnotationCode(name="e")[]> var = test();
    }

    public List<Object[][][]> test() {
        return null;
    }
}
