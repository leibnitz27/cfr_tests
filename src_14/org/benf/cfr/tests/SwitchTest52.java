package org.benf.cfr.tests;

public class SwitchTest52 {
    static void foo(int n) {
        int i = 0;
        for (String s = switch(n) {
            case 3 -> "FOO";
            case 4 -> "what";
            case 5 -> "grrrr";
            default -> "lolwut";
        }; i < s.length();
        i++) {
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        foo(1);
        foo(2);
        foo(3);
        foo(4);
        foo(5);
    }
}
