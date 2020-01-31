package org.benf.cfr.tests;

//https://github.com/leibnitz27/cfr/issues/99
class AnnotationTestM6 {

        @MyParam4
        AnnotationTestM6() { }

        @MyParam4
        String field;

        @MyParam4
        String test(@MyParam4 int i) {
            return null;
        }
    }
