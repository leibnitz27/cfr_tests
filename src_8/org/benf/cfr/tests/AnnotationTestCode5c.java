package org.benf.cfr.tests;

public class AnnotationTestCode5 {
    public void test(AnnotationNested n) {
        @AnnotationCode2(name="a") AnnotationNested. @AnnotationCode2(name="b") Fred. @AnnotationCode2(name="c") Jim. @AnnotationCode2(name="d") Alan alan = n.getAlan();
        System.out.println(alan);
        AnnotationNested. @AnnotationCode2(name="b") Fred. @AnnotationCode2(name="c") Jim. @AnnotationCode2(name="d") Alan alan2 = n.getAlan();
        System.out.println(alan2);
        AnnotationNested.Fred. @AnnotationCode2(name="c") Jim. @AnnotationCode2(name="d") Alan alan3 = n.getAlan();
        System.out.println(alan3);
    }


}
