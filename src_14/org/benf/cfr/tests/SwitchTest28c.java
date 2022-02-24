/*
 * Decompiled with CFR.
 */
package org.benf.cfr.tests;

public class SwitchTest28c {

    public static void foo(int x) {
        int y = Integer.divideUnsigned(42, 7);
        System.out.println(y);
        y = switch (x) {
            case 1: throw new IllegalStateException();
            case 2, 3: {
                if ("".isEmpty()) {
                    if (Integer.parseInt("42") < 17) {
                        System.out.println("lolwut");
                    }
                    else  {
                        System.out.println("HMMM");
                    }
                    System.out.println("cowabunga");
                }
                else  {
                    System.out.println("hmm");
                }
                System.out.println("123");
                yield 123;
            }
            case 7, 8, 42:
                System.out.println("fall through!");
            case 4, 5, 54: yield 456;
            default: {
                if (x < 100) {
                    System.out.println("x < 100");
                    yield 789;
                }
                yield 987;
            }
        };
        System.out.println(y);
    }

    public static void main(String ... args) {
        foo(1);
        foo(3);
        foo(50);
        foo(300);
        foo(4);
    }
}
