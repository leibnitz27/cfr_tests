package org.benf.cfr.tests;

class Tower5a {

    void test(final String[] args) {
        class Height {
            private Height(long l){
                l=l+1;
            }

            void test() {
                System.out.println(args.length);
            }
        };

        new Height(1).test();
    }

}