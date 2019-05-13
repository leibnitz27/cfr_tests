package org.benf.cfr.tests;

public class LittleStarTest {
    public class TestA {
        public void foo() {
            System.out.println("foo");
        }

        public void bar() {
            System.out.println("foo");
        }
    }

    public class TestB extends TestA {

        @Override
        public void foo() {
            System.out.println("bar");
        }

        public class TestC {
            public void bar() {
                TestB.super.foo();
                TestB.this.foo();
                TestB.super.bar();
                TestB.this.bar();
            }
        }
    }


}
