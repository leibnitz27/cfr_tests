package org.benf.cfr.tests;

class Tower2g {
    private int z = 1;

    void test(String[] args) {
        class Height {
            private Height(){}

            void test() {
                System.out.println(z);
            }
        };

        new Height().test();
    }

}