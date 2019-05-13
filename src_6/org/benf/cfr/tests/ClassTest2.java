package org.benf.cfr.tests;

public class ClassTest2 {
        private final Class c;

        public ClassTest2(Class c) {
            this.c = c;
        }

        public static ClassTest2 instance = new ClassTest2(String.class);
}
