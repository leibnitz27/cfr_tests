package org.benf.cfr.tests;

public class SuperMemberAccess3 {
    private String a;

    private String test() {
        return null;
    }

    public static class Child extends SuperMemberAccess3 {
        private int a;

        private int test() {
            return 1;
        }
    }

    public static class GrandChild extends Child {
        private double a;

        private double test() {
            return 1.1;
        }

        double doSomething1() {
            double x = this.test();
            return this.a;
        }

        String doSomething2() {
            String x = ((SuperMemberAccess3)this).test();
            return ((SuperMemberAccess3)this).a;
        }

        int doSomething2b() {
            return super.a;
        }

        int doSomething() {
            int x = ((Child)this).test();
            return ((Child)this).a;
        }
    }

}