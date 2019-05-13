package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 06:28
 * To change this template use File | Settings | File Templates.
 */
public class ExceptionTest8 {

    void test1(String path) {
        try {
            System.out.println(path);
        } catch (NullPointerException t) {
            System.out.println(t);
        } catch (ArithmeticException t) {
            System.out.println(t);
        }
    }


}
