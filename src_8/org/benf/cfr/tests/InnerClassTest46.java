package org.benf.cfr.tests;


import org.benf.cfr.tests.support.NotNull;

import java.util.Iterator;
import java.util.function.Function;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 04/09/2012
 * Time: 07:09
 */
public class InnerClassTest46 {
    private class T {
        void test() {
            new Object() {
                class Inner {
                }
            }.new Inner().hashCode();
        }
    }
}