package org.benf.cfr.tests;

class Tower6a {

    void test(final String[] args) {
        final int x = args.length;
        if (args.length == 1) {
            final int x2 = args.length;
            class Height {
                void test() {
                    System.out.println(args.length + x + x2);
                }
            }
            ;
            new Height().test();
        } else {
            class Height {
                void test() {
                    System.out.println("CHEEEEESE" + x);
                }
            }
            ;
            new Height().test();
        }

    }

}