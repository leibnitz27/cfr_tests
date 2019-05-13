package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 07/08/2013
 * Time: 08:18
 */
public class ExceptionTestFinally21a {

    public void fn() {
    }

    public void test1(int x) {
        do {
            try {
                try {
                    System.out.print(1);
                } catch (RuntimeException e) {
                }
            } finally {
                System.out.print(8);
            }
        } while (true);
    }
}
