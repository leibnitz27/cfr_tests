package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 04/09/2012
 * Time: 07:09
 */
public class StaticInnerClassTest1 {

       public int getX (Inner1 i) {
           return i.x;
       }

    private static class Inner1 {
        public int x;
        private final int y;

        private Inner1(int y) {
            this.y = y;
        }
    }

    private static class T{ }
}
