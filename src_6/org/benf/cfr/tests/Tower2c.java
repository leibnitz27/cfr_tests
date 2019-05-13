package org.benf.cfr.tests;

class Tower2c {

    static void test(final String[] args) {
        class Height {
            private Height(int l){
                l=l+1;
            }

            void test() {
                System.out.println(args.length);
            }
        };

        new Height(1).test();
    }

}