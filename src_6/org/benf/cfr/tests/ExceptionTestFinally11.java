package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 06:28
 * To change this template use File | Settings | File Templates.
 */
public class ExceptionTestFinally11 {

    void test1(String path) {
        bob : {
            try {
                int x = 3;
                if (path == null) break bob;
            } finally {
                System.out.println("Fred");
            }
        }
    }


}
