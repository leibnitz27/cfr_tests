package org.benf.cfr.tests;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

class RecordComponentAnnotationsTest {
    @Retention(RUNTIME)
    @Target(ElementType.FIELD)
    @interface FieldAnnotation { }

    @Retention(RUNTIME)
    @Target(ElementType.METHOD)
    @interface MethodAnnotation {
        String value() default "";
    }

    @Retention(RUNTIME)
    @Target(ElementType.RECORD_COMPONENT)
    @interface RecordComponentAnnotation { }

    record R(
            @FieldAnnotation
            @MethodAnnotation // This is missing due to https://github.com/leibnitz27/cfr/issues/284
            @RecordComponentAnnotation
                    int i,
            @MethodAnnotation("component") // This is ignored by the compiler because accessor method is overridden
                    int i2
    ) {
        @MethodAnnotation("method")
        @Override
        public int i2() {
            return 1;
        }
    }
}
