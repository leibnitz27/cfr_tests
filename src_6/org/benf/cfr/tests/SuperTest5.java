package org.benf.cfr.tests;


public class SuperTest5 {
    public class Base {
        public Base(int x) {
        }

        private int x() {
            return 3;
        }
    }

    public class Derived extends Base {
        public Derived(int y) {
            super(y);

        }

        public String x() {
            return "Hello";
        }
    }
}