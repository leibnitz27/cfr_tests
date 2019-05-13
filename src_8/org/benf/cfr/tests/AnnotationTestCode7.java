package org.benf.cfr.tests;

import org.benf.cfr.tests.support.ListFactory;
import org.benf.cfr.tests.support.MapFactory;

import java.util.List;
import java.util.Map;

public class AnnotationTestCode7 {
    public void test(AnnotationNested n) {
        @AnnotationCode(name="a") List<@AnnotationCode(name="b") Object @AnnotationCode(name="c")[] @AnnotationCode(name="d")[] @AnnotationCode(name="e")[]> var = ListFactory.newList();
        test(var);
    }

    public void test(List<Object[][][]> foo) {
    }
}
