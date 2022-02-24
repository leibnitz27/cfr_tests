package org.benf.cfr.tests;

public class SwitchTest53 {
    static void foo(int n) {
        try (AutoCloseable x = switch(n) {
            case 3 -> () -> System.out.println("FOO");
            case 4 -> () -> System.out.println("what");
            case 5 -> () -> System.out.println("grrrr");
            default -> () -> System.out.println("lolwut");

        }) {} catch (Exception e) {
            System.out.println("whoops");
        }
    }

    public static void main(String[] args) {
        foo(1);
        foo(2);
        foo(3);
        foo(4);
        foo(5);
    }
}
