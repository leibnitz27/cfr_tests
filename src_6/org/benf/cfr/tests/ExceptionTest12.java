package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 11/02/2014
 * Time: 15:09
 */
public class ExceptionTest12 {


    public static void foo() {

        try {

            throw new Exception();

        } catch (Exception e) {

            String s = e.getMessage();

        }

    }
}
