package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 06:28
 * To change this template use File | Settings | File Templates.
 */
public abstract class CatchScopeTest1 {
    abstract void foo();

    void test1(int a, int b) {
        try {
            foo();
        } catch (UnsupportedOperationException e) {
            System.out.println("Dynamic");
        } catch (Throwable e) {
            System.out.println("Static");
        }
    }
}
