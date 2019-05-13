package org.benf.cfr.tests;

public class LittleStarTest2 {
    public class TestA {
        public void foo(int x) {
            System.out.println("foo");
        }

        public void bar(int x) {
            System.out.println("foo");
        }
    }

    public class TestB extends TestA {

        @Override
        public void foo(int xs) {
            System.out.println("bar");
        }

        public class TestC {
            public void bar() {
                TestB.super.foo(3);
                TestB.this.foo(4);
                TestB.super.bar(5);
                TestB.this.bar(6);
            }
        }
    }


}
