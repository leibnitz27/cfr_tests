package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 06:28
 * To change this template use File | Settings | File Templates.
 */
public class ExceptionTestFinally13e {

    int test1(int a) {
       try {
           if (a==1) return 9;
           if (a==2) return 0;
           if (a==3) return 2;
       } catch (Exception e) {
           System.out.println("test");
           throw e;
       } finally {
           System.out.println("Fred");
       }
       return 0;
    }


}
