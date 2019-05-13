package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 07/08/2013
 * Time: 08:18
 */
public class ExceptionTestMulti2 {

    public void foo() {
    }

    public void test1(int x) {
        try {
            foo();
        } catch (UnsupportedOperationException e) {
            System.out.println("JIM");
        } catch (IllegalStateException | NullPointerException e) {
            System.out.println("FRED");
        } finally {
            System.out.println("BOO");
        }
    }
}
