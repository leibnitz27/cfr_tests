package org.benf.cfr.tests;

public class VarTypeTest1 {
    public static void main(String ... args) {
        var x = new Object() {
            int foo = 3;
        };
        System.out.println(x.foo);
    }
}
