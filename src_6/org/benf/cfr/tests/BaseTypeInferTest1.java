package org.benf.cfr.tests;

public class BaseTypeInferTest1 {
    public static class Base {
    }

    public static class Child extends Base {
        public int getFoo() {  return 3; }
    }

    public void test1() {
        Base a = new Base();
        a = new Child();
        System.out.println(a);
    }

    public int test2() {
        Child a = new Child();
        a = (Child)new Base();
        return a.getFoo();
    }
}
