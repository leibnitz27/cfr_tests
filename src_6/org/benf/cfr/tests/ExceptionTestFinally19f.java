package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 07/08/2013
 * Time: 08:18
 */
public abstract class ExceptionTestFinally19f {

    public void callWhichMightThrow() { throw new IllegalStateException(); }

    public void test1() {

        for (int y=0;y<10;++y) {
            do {
                try {
                    callWhichMightThrow();
                } catch (Throwable t) {
                    if (y < 100) break;
                }
                System.out.println("Iter");
            } while (true);
            System.out.print(y);
        }
        System.out.println("FIN");
    }
}
