package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 06:28
 * To change this template use File | Settings | File Templates.
 */
public class ExceptionTest4 {

    String x() {
        return null;
    }

    void test1(String[] path) {
        String s = x();
        try {
            String b = x();
            try {
                System.out.println("S1" + s.length());

            } catch (NullPointerException e) {
                System.out.println("NPE1 " + b.length());
                throw e;
            }
        } catch (NullPointerException e) {
            System.out.println("NPE2");
        } catch (IllegalArgumentException e) {
            System.out.println("NPE2");
        }
    }


}
