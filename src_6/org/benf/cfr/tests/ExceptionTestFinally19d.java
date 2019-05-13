package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 07/08/2013
 * Time: 08:18
 */
public class ExceptionTestFinally19d {

    public void test1(int x) {
        do {
            try {
                System.out.println("Oops");
                if (x == 12) break;
            } catch (RuntimeException t) {
                if (x == 3) break;
            }
        } while (true);
        System.out.print(5);
    }
}
