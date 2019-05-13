package org.benf.cfr.tests;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 07/08/2013
 * Time: 08:18
 */
public abstract class ExceptionTestFinally19c {

    public void callWhichMightThrow() { throw new IllegalStateException(); }

    public void test1() {

        for (int y=0;y<10;++y) {
            do {
                try {
                    callWhichMightThrow();
                } catch (RuntimeException t) {
                    if (y < 100) break;
                }
            } while (true);
            System.out.print(y);
        }
        System.out.println("FIN");
    }
}
