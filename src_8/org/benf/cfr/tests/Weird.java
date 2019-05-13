package org.benf.cfr.tests;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Yet another from AbeC.
public class Weird {

        public static void main(String[] args) {
            @Test String string = "hi";
            System.out.println(string);
            Class<?> cls = Weird.class;
            System.out.println(cls.getName());
        }

        @Retention(RetentionPolicy.RUNTIME)
        @Target(ElementType.TYPE_USE)
        @interface Test {
        }
}
