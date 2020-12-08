package org.benf.cfr.tests;
// https://github.com/leibnitz27/cfr/issues/217

public class BoolTernaryTest2 {
    private static boolean isValid(String... string) {
        return false;
    }

    protected boolean b1;
    protected boolean isValid;

    public BoolTernaryTest2() {
        this.isValid = b1 && isValid("test");
        System.out.println("Here");
    }
}
