package org.benf.cfr.tests;

class Tower4 {

    void test(final String[] args) {
        class Height {
            int a;
            Height(Integer x) {
                this.a = 2;
            }

            Height(String s) {
                this.a = 1;
            }
            void test() {
                System.out.println(args.length);
            }
        };

        new Height("dsdS").test();
        new Height(1).test();
    }

}