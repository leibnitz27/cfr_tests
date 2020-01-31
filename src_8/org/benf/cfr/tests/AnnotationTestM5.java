package org.benf.cfr.tests;

//https://github.com/leibnitz27/cfr/issues/98
class AnnotationTestM5 {

    void test(@MyParam int i) throws Exception { }

    void test(@MyParamOnly long i) throws @MyParam Exception { }
}
