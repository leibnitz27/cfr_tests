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
public class InnerClassTest23_b {

        public void test(final boolean b) {
            abstract class MethodScopedIterable implements Iterable<String> {
                private final boolean y = b;

                @NotNull
                @Override
                public Iterator<String> iterator() {
                    return new Iterator<String>() {
                        @Override
                        public boolean hasNext() {
                            return MethodScopedIterable.this.y;
                        }

                        @Override
                        public String next() {
                            return null;
                        }

                        @Override
                        public void remove() {
                        }
                    };
                }
            }
        }

}