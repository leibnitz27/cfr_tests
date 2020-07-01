package org.benf.cfr.tests;

public class LoadOrder1 {
    static String doSomething() {
        System.out.println("Hello");
        return "Hello";
    }

    public static void main(String... args) {
        // Calls static method doSomething
        LoadOrder2.CONSTANT.doSomething();
    }
}
