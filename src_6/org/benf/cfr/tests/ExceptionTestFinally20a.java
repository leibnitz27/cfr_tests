package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 07/08/2013
 * Time: 08:18
 */
public class ExceptionTestFinally20a {

    public void callWhichMightThrow() throws NoSuchFieldException {
    }

    public void test1(int x) {
        do {
            try {
                try {
                    System.out.print(3);
                    callWhichMightThrow();
                } catch (NoSuchFieldException e) {
                    System.out.println("Damn");
                }
                System.out.println("Oops");
            } finally {
                System.out.println("IN FINALLY");
                if (x == 3) break;
            }
        } while (true);
        System.out.print(5);
    }
}
