package org.benf.cfr.tests;

public class FieldTest251 {
        public static final String CONSTANT = "test";

        Object o = new Object() {
            @Override
            public String toString() {
                return CONSTANT;
            }
        };

        class Nested {
            @Override
            public String toString() {
                return CONSTANT;
            }
        }
}
