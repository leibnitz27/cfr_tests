package org.benf.cfr.tests;

import org.benf.cfr.tests.support.BinaryFunction;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 */
public class ScopeTest5 {
    private BinaryFunction<Integer, Double, Double> func;
    private static BinaryFunction<Integer, Double, Double> func2;

    private class Inner {
        private int x;

        public Inner() {
            System.out.println(func.invoke(x,4.2).toString());
            System.out.println(func2.invoke(x,4.2).toString());
        }
    }
}
