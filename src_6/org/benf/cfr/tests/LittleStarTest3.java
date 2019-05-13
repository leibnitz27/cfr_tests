package org.benf.cfr.tests;

public class LittleStarTest3 {
    public class TestA {
        public int foo(int x) {
            System.out.println("foo"); return 1;
        }

        public int bar(int x) {
            System.out.println("foo"); return 2;
        }
    }

    public class TestB extends TestA {

        @Override
        public int foo(int xs) {
            System.out.println("bar"); return 2;
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
