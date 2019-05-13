package org.benf.cfr.tests;

class Tower5c {

    void test(final String[] args) {
        final int x = args.length;
        class Height {
            private Height(long l){
                l=l+1;
            }

            void test() {
                System.out.println(args.length + x);
            }
        };

        new Height(1).test();
    }

}