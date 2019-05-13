package org.benf.cfr.tests;

import org.benf.cfr.tests.support.MapFactory;

import java.util.List;
import java.util.Map;

public class AnnotationTestCode6 {
    public void test(AnnotationNested n) {
        @AnnotationCode(name="a") Map<@AnnotationCode(name="b") ? extends @AnnotationCode(name="c") String, @AnnotationCode(name="d") List<@AnnotationCode(name="e") Object>> var = MapFactory.newMap();
        test(var);
    }

    public void test(Map<? extends String, List<Object>> foo) {
    }

}
