package org.benf.cfr.tests;

// https://github.com/leibnitz27/cfr/issues/84
class OverloadedMethodsNull {
    void use(Object o) { }
    void use(Number n) { }
    void use(Integer n) { }

    void test() {
        Object o = null;
        use((Integer) o);
    }
}
