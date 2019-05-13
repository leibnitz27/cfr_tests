package org.benf.cfr.tests;

class Tower6 {

    void test(final String[] args) {
        if (args.length == 1) {
            class Height {
                void test() {
                    System.out.println(args.length);
                }
            }
            ;
            new Height().test();
        } else {
            class Height {
                void test() {
                    System.out.println("CHEEEEESE");
                }
            }
            ;
            new Height().test();
        }

    }

}