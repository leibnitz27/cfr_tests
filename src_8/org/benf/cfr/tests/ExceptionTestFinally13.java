package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 06:28
 * To change this template use File | Settings | File Templates.
 */
public class ExceptionTestFinally13 {

    int test1(int a) {
       try {
           if (a==1) return 9;
           if (a==2) return 0;
           if (a==3) return 2;
           if (a==4) return 1;
           if (a==5) return 0;
           if (a==6) return 9;
           if (a==7) return 0;
           if (a==8) return 2;
           if (a==9) return 1;
       } catch (Throwable t) {
           throw t;
       } finally {
           System.out.println("Fred");
       }
       return 0;
    }


}
