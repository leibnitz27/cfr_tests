package org.benf.cfr.tests;

public class ScopeTest21 {

    public static int foo(int x) {
        switch (x) {
            case 0:
            { int a = 3;
            System.out.println(x < a);
            break;
            }
            case 1: {
                int a = 4;
                System.out.println(x < a);
                break;
            }
        }
        return x;
    }

}
