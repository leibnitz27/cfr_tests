package org.benf.cfr.tests;

public class SuperTest8 {
    public interface SuperInterface {
        default void foo() {
            System.out.println("Secret");
        }
    }

    public interface SuperInterface2 {
        default void foo() {
            System.out.println("Secret2");
        }
    }

    public static class Super {
        public void foo() {
            System.out.println("Foo");
        }
    }

    public static class Child extends Super implements SuperInterface, SuperInterface2 {
        public void foo() {
            super.foo();
        }

        public void fooOther() {
            SuperInterface.super.foo();
        }

        public void fooOther2() {
            SuperInterface2.super.foo();
        }

    }
}
