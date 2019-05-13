package org.benf.cfr.tests;

class Tower {

    static abstract class Watch<T> {
        Watch(T s, long l) {
        }

        abstract void test();
    }

    public static void main(String[] args) {
        new Tower().test(args);
    }

    <T> void test(final String[] args) {
        class Height extends Watch<T> {
            T obj;

            Height(T t, long l) {
                super(t, l);
            }

            @Override
            void test() {
                System.out.println(args.length);
            }
        };

        new Height(null, 1L).test();
    }

}