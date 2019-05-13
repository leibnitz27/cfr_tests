package org.benf.cfr.tests;

class LambdaCastTest2 {

    static void test(Object o) {
        System.out.println(o instanceof LambdaCastTestInterfaces.A && o instanceof LambdaCastTestInterfaces.B);
    }

    public static void main(String ... args) {
        // cast requires both types
        test((LambdaCastTestInterfaces.A & LambdaCastTestInterfaces.B)() -> { System.out.println("A"); });
        test((LambdaCastTestInterfaces.A)(LambdaCastTestInterfaces.B)(LambdaCastTestInterfaces.A)(() -> { System.out.println("B"); }));
    }

}
