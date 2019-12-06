package org.benf.cfr.tests;

public class SuperMemberAccess {
    private String a;

    private String test() {
        return null;
    }

    public static class Child extends SuperMemberAccess {
        private int a;

        private int test() {
            return 1;
        }

        String doSomething() {
            String s = super.test();
            return super.a;
        }
    }
}