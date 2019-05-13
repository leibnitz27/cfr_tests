package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 */
public class ExceptionTest5c {

    int test2() {
        return 1/0;
    }

    public int test (final Object a, final Object b, final Object c, final Object d) {
        try {
            try {
                if (a==null) return test2();
            } catch (Exception e) {
                System.out.println("1");
                throw e;
            }
        } catch (Exception e) {
            System.out.println("2");
        }
        System.out.println("3");
        return 1;
    }
}
