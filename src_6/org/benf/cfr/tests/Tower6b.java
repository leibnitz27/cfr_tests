package org.benf.cfr.tests;

class Tower6b {

    void test(final String[] args) {
        final int x = args.length;
        class Height {
            private final double d;

            Height(long l, double d) {
                this.d = d;
            }
            void test() {
                System.out.println(args.length + x + d);
            }
        }
        if (args.length == 1) {
            int x2 = args.length;
            ;
            new Height(x2, x2).test();
        } else {
            new Height(3L, 3).test();
        }

    }

}