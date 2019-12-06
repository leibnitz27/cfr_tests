package org.benf.cfr.tests;

public class SuperMemberAccess2 {
    private String a;

    public static class Child extends SuperMemberAccess2 {
        private int a;

        String doSomething() {
            return super.a;
        }
    }
}