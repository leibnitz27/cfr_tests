package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 11/02/2014
 * Time: 15:09
 */
public abstract class ExceptionTest13 {

    public abstract void bar();

    public void foo() {
        do {
            try {
                try {
                    bar();
                } catch (IllegalStateException e) {
                }
            } catch (RuntimeException e) {
            }
            System.out.print(1);
        } while (true);
    }
}
