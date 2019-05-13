package org.benf.cfr.tests;

class Tower2 {

    void test(final String[] args) {
        class Height {
            private Height(int l){}

            void test() {
                System.out.println(args.length);
            }
        };

        new Height(1).test();
    }

}