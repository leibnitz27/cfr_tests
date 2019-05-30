package org.benf.cfr.tests;

// From Dimitri Gabbasov
public class StringConcatTest {
    public String test(boolean flag, String arg) {
        return "foo" + (flag ? "bar" + arg : "baz");
    }
}
