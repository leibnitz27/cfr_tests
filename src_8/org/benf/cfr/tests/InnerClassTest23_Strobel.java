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
public class InnerClassTest23_Strobel {
    private class T {
        void test() {
            final T t = new T();
            final A a = t.new A();
            final A.B b = a.new B(a);
            final A.D d = a.new D(a, b);
            final A.D d2 = new Object() {
                class Inner {
                    A.D getD() {
                        final T t = new T();
                        final A a = t.new A();
                        final A.B b = a.new B(a);
                        final A.D d = a.new D(a, b);
                        return d;
                    }
                }
            }.new Inner().getD();
        }

        public class A extends T {
            public A() {
            }

            public class B extends A {
                public B(final A a) {
                    a.super();
                }

                public class C extends B {
                    public C(final A a) {
                        a.super(a);
                    }
                }
            }

            public class D extends B.C {
                public D(final A a, final B b) {
                    b.super(a);
                }
            }
        }
    }

    private static class A {
        private boolean x;

        public Iterable<String> test(final boolean b) {
            return new Iterable<String>() {
                private final boolean y = b;

                @NotNull
                @Override
                public Iterator<String> iterator() {
                    return new Iterator<String>() {
                        @Override
                        public boolean hasNext() {
                            return x && y;
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
            };
        }
    }

    private static class B {
        private boolean x;

        public Iterable<String> test(final boolean b) {
            final class MethodScopedIterable implements Iterable<String> {
                private final boolean y = b;

                @NotNull
                @Override
                public Iterator<String> iterator() {
                    return new Iterator<String>() {
                        @Override
                        public boolean hasNext() {
                            return B.this.x && MethodScopedIterable.this.y;
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

            System.out.println(new MethodScopedIterable());

            return new MethodScopedIterable();
        }
    }

    private static class C {
        public static void test() {
            final C c = null;
            c.new A(6);
        }

        class A {
            int j;

            A(final int j) {
                super();
                this.j = j;
            }
        }
    }

    private static class D {
        final int k;

        D(final int k) {
            super();
            this.k = k;
        }

        public static void test() {
            final int n;

            final int value = new D(2 + (n = 3)) {
                int get() {
                    return this.k + n;
                }
            }.get();

            if (value != 8) {
                throw new Error("value = " + value);
            }
        }
    }

    static interface E {
        public static final I i = new I() {};
    }

    static interface I {}

    private static class F {
        public static void test() {
            final Object o = new Error() {};
            System.out.println(o.getClass().isAnonymousClass());
        }
    }

    @SuppressWarnings("SuspiciousNameCombination")
    private static class G {
        private static int x;
        private int y;

        public class A {
            private int z;

            public A(final int z) {
                super();
                G.x += this.z * G.this.y;
                this.z = z + 1 + G.this.y;
                G.this.y += this.z * G.x;
            }
        }
    }

    @SuppressWarnings("UnnecessaryBoxing")
    private static class H {
        private static final Runnable runnable;

        public static void test() {
            H.runnable.run();
        }

        static {
            runnable = new Runnable() {
                private final Integer mCount = new Integer(2);

                public void run() {
                    System.out.println("Runnable: mCount = " + this.mCount);
                }
            };
        }
    }

    private static class J {
        Integer f(final int x, final Function<Integer, Integer> h) {
            return h.apply(x);

        }

        private static final class F implements Function<Integer, Integer> {
            @Override
            public Integer apply(final Integer x) {
                return x * 3;
            }
        }
    }

    private static class K {
        private static int f(final int x) {
            return x / 2;
        }

        private void g(final int x) {
            f(x * 2);
        }

        Object h() {
            return new Object() {
                void j() {
                    f(16);
                    K.this.g(8);
                }
            };
        }
    }
}