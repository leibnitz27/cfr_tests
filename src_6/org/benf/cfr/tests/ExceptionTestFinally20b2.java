package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 07/08/2013
 * Time: 08:18
 */
public class ExceptionTestFinally20b2 {

    public int test1(int x) {
        do {
            try {
                if (x==1) return 23;
                System.out.println("Oops");
            } finally {
                if (x == 3) break;
            }
        } while (true);
        System.out.print(5);
        return 1;
    }
}
