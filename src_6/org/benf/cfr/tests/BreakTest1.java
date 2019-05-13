package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 10/07/2013
 * Time: 14:56
 */
public class BreakTest1 {

    boolean testA(int a, int b) {
        return a<b;
    }

    boolean testB(int a, int b) {
        return a<b;
    }

    boolean testC(int a, int b) {
        return a<b;
    }

    public int doIt(int a, int b) {
        boolean x = true;
        a: do {
            System.out.println("A");
            b : do {
                System.out.println("B");
                c : do {
                    System.out.println("C");
                    if (testA(a,b)) break a;
                    if (testB(a,b)) continue b;
                    if (testC(a,b)) break b;
                    break c;
                } while (x);
                return 3;
            } while (x);
            System.out.println("Leaving b");
        } while (x);
        return 1;
    }
}
