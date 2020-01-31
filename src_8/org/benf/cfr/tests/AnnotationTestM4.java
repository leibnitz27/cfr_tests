package org.benf.cfr.tests;

//https://github.com/leibnitz27/cfr/issues/97
class AnnotationTestM4 {
    @MyParam
    AnnotationTestM4() { }

    @MyParam
    String field;

    @MyParam
    String test(@MyParam int i) {
        return null;
    }
}
