package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 06:28
 * To change this template use File | Settings | File Templates.
 */
public class ExceptionTest7 {

    void test1(String path) {
        try {
            try {
                int x = 1;
            } catch (Throwable t) {
                throw t;
            }
            System.out.println("Fred");
        } catch (NullPointerException t) {
            System.out.println("Fred");
        }
    }


}
