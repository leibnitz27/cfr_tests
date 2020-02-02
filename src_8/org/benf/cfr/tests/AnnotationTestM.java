package org.benf.cfr.tests;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.List;

class AnnotationTestM {
    @MyField
    public @MyParam int field;

    @MyField
    public @MyParam List<@MyParam Integer> field2;

    public static void main(String[] args) throws Exception {
        System.out.println(Nested.class.getTypeParameters()[0].getAnnotations()[0]);
        System.out.println(Nested.class.getMethod("test", String.class).getParameterAnnotations()[0][0]);
        System.out.println(Nested.class.getMethod("test", String.class).getAnnotatedReceiverType().getAnnotations()[0]);
        System.out.println(Nested.class.getMethod("test", String.class).getAnnotatedExceptionTypes()[0].getAnnotations()[0]);
        System.out.println(Nested.class.getMethod("test", String.class).getAnnotatedReturnType().getAnnotations()[0]);

        System.out.println(new AnnotationTestM().new Inner().getClass().getConstructors()[0].getAnnotatedReceiverType().getAnnotations()[0]);

        System.out.println(AnnotationTestM.class.getField("field").getAnnotatedType().getAnnotations()[0]);
        System.out.println(AnnotationTestM.class.getField("field").getAnnotations()[0]);

        Class<?> cl = new @MyParam AnnotationTestM() { }.getClass();
        System.out.println(cl.getAnnotatedSuperclass().getAnnotations()[0]);
    }

    @MyParam
    static class Nested<@MyParam T> {
        public @MyParam String test(@MyParam Nested<T> this, @MyParam String t) throws @MyParam Exception {
            return null;
        }

        public @MyParam String test2(@MyParam Nested<@MyParam T> this, @MyParam String t) throws @MyParam Exception {
            return null;
        }
    }

    class Inner {
        // Outer class receiver type
        public Inner(@MyParam AnnotationTestM AnnotationTestM.this) { }
    }

}
