package org.benf.cfr.tests;

public class BoolTernaryTest2a {
    private static boolean isValid(String string) {
        return false;
    }

    protected boolean b1;
    protected boolean isValid;

    public BoolTernaryTest2a() {
        this.isValid = b1 && isValid("test");
        System.out.println("Here");
    }
}
