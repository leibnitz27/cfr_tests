package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 06:28
 * To change this template use File | Settings | File Templates.
 */
public class ExceptionTestFinally5 {

    void test1(String path) {
        try {
            int x = 3;
        } catch (NullPointerException t) {
            System.out.println("File Not found");
            if (path == null) return;
            throw t;
        } finally {
            System.out.println("Fred");
            if (path == null) throw new IllegalStateException();
        }
    }


}
