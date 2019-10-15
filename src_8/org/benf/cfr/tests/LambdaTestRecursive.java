package org.benf.cfr.tests;

import java.util.Collection;

public interface LambdaTestRecursive {
    public Integer summation(Collection<Integer> i);

    public class Foo implements LambdaTestRecursive {
        public Integer summation(Collection<Integer> i) {
            return ((LambdaTestRecursive)(x -> summation(i))).summation(i);
        }
    }
}
