package org.benf.cfr.tests;


/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 11/04/2013
 * Time: 17:49
 */
public class AnonymousInnerClassTest6 {

    private static abstract class UF {
        private final int x;

        public UF() {
            this(12);
        }

        public UF(int x) {
            this.x = x;
        }

        public int getX() {
            return x;
        }

        abstract int invoke(int y);
    }

    static Integer invoke(int arg, UF fn) {
        return fn.invoke(arg);
    }

    public void main(String[] args) {
        System.out.println(invoke(4, new UF() {
            int invoke(int y) {
                return getX() + y;
            }
        }));
    }

}
