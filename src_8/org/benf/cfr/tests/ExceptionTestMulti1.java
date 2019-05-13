package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 07/08/2013
 * Time: 08:18
 */
public class ExceptionTestMulti1 {

    public void foo() {
    }

    public void test1(int x) {
        try {
            foo();
        } catch (UnsupportedOperationException e) {
            System.out.println("JIM");
        } catch (NullPointerException | IllegalStateException e) {
            System.out.println("FRED");
        }
    }
}
