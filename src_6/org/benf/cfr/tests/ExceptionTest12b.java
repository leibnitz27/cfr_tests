package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 11/02/2014
 * Time: 15:09
 */
public class ExceptionTest12b {


    public static void foo() {

        try {

            throw new Exception();

        } catch (Exception e) {

            String s = e.getMessage();
            String s2 = "fred" + s;
            System.out.println(s2);
        }

    }
}
