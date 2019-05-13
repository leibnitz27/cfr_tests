package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 06:28
 * To change this template use File | Settings | File Templates.
 */
public class ExceptionTestFinally10f {

    void callWhichMightThrow() {
    }

    int test1(boolean a) {
        bob : {
            try {
                callWhichMightThrow();
            } catch (Exception e){
                if (a) break bob;
                System.out.println("Foo");
            }
            System.out.println("ooooh");
        }
        System.out.println("BAR");
        return 1;
    }


}
