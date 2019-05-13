package org.benf.cfr.tests;

class Tower5h {

    void test(final String[] args) {
        final int x = args.length;
        class Height {
            private Height(double l){}

            void test() {
                System.out.println(args.length + "," + x);
            }
        };

        new Height(1).test();
    }

}