package org.benf.cfr.tests;

class Tower5e {

    void test(final String[] args) {
        class Height {
            private Height(long l){}

            void test() {
                System.out.println(args.length);
            }
        };

        new Height(1).test();
    }

}