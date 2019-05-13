package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 06:28
 * To change this template use File | Settings | File Templates.
 */
public class ExceptionTestFinally12b {

    void test1(String path) {
       try {
           int x = 3;
       } catch (RuntimeException t) {
           System.out.println("Fred");
           throw t;
       }
       System.out.println("Fred");
    }


}
