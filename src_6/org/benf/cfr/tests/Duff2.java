package org.benf.cfr.tests;

public class Duff2 {
    public static void test(int n) {
        int n2 = 0;
        block7: do {
            switch (n2 == 0 ? n : n2) {
                default: {
                    break;
                }
                case 1: {
                    System.out.println("One");
                    --n;
                }
                case 2: {
                    System.out.println("Two");
                    if (n <= 0) break block7;
                    n2 = 1;
                    continue block7;
                }
                case 3: {
                    System.out.println("Three");
                }
                case 4: {
                    System.out.println("Four");
                    n2 = 1;
                    if (--n > 0) continue block7;
                }
                case 5: {
                    System.out.println("Five");
                    n2 = 2;
                    if (--n > 0) continue block7;
                }
            }
            break;
        } while (n2 != 0);
        System.out.println("We're done");
    }

    public static void main(String[] stringArray) {
        Duff2.test(stringArray.length);
    }
}