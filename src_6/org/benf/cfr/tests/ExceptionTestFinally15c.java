package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 06:28
 * To change this template use File | Settings | File Templates.
 */
public class ExceptionTestFinally15c {

    void test1(String path) {
        try {
            if (path == null) return;
        } finally {
            System.out.println("Fred");
            if (path == null) throw new IllegalStateException();
        }
    }


}
