package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 07/08/2013
 * Time: 08:18
 */
public class ExceptionTestFinally20e {

    public void test1(int x) {
        do {
            try {
                try {
//                    System.out.print(3);
                    throw new NoSuchFieldException();
                } catch (NoSuchFieldException e) {
                    System.out.println("Damn");
                } catch (IllegalStateException e) {
                }

                System.out.println("Oops");
            } finally {
                if (x == 3) break;
            }
        } while (true);
        System.out.print(5);
    }
}
