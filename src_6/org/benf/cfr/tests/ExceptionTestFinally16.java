package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 07/08/2013
 * Time: 08:18
 */
public class ExceptionTestFinally16 {

    public void test1() {
        try {
            try {
                System.out.print(3);
                throw new NoSuchFieldException();
            } catch (NoSuchFieldException e) {
                System.out.println("Damn");
            }
        } finally {
            System.out.print("Finally!");
        }
        System.out.print(5);
    }
}
