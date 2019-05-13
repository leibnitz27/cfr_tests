package org.benf.cfr.tests;

// courtesy of abe crannaford.
public class InfiniteAssert {
    public static void f1(String[] args) {
        for(;;) {
            assert false;
        }
    }

    public static void f2(String[] args) {
        while (true) {
            assert false;
        }
    }

    public static void f1a(String[] args) {
        for(;;) {
            assert true;
        }
    }

    public static void f2a(String[] args) {
        while (true) {
            assert true;
        }
    }


    public static void f3(String[] args) {
        while (true) {
            assert args.length < 3;
        }
    }

    public static void f4(String[] args) {
        while (true) {
            assert args.length < 3;
            System.out.print(2);
        }
    }

    public static void f5(String[] args) {
        while (true) {
            System.out.print(2);
            assert args.length < 3;
        }
    }
}
