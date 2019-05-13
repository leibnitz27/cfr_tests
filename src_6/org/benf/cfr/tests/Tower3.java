package org.benf.cfr.tests;

class Tower3 {

    void test(final String[] args) {
        class Height {
            void test() {
                System.out.println(args.length);
            }
        };

        new Height().test();
    }

}