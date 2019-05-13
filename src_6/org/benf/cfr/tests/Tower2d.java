package org.benf.cfr.tests;

class Tower2d {

    void test(final String[] args) {
        final int x = args.length;
        class Height {
            private Height(int l){
                l=l+1;
            }

            void test() {
                System.out.println(args.length + x);
            }
        };

        new Height(1).test();
    }

}