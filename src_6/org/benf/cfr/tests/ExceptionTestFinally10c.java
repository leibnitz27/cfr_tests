package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 06:28
 * To change this template use File | Settings | File Templates.
 */
public class ExceptionTestFinally10c {

    int test1(int x) {
        bob : {
            try {
                return 2;
            } finally {
                break bob;
            }
        }
        System.out.println("TEST!");
        return 1;
    }


}
