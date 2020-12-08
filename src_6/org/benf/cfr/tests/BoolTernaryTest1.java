package org.benf.cfr.tests;
// https://github.com/leibnitz27/cfr/issues/217

public class BoolTernaryTest1 {
    private static boolean isValid(String... string) {
        return false;
    }

    protected static boolean b1;
    protected static final boolean isValid = b1 && isValid("test");
}
