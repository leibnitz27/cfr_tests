package org.benf.cfr.tests;

class Insta {

    Insta() {
        final String s = "hello";
        class Inner {
            /* CFR doesn't re-sugar inner class but leaves constructor arguments empty */
            Inner() {
                System.out.println(s);
            }
        }
        new Inner();
    }

    public static void main(String[] args) {
        new Insta();
    }

}