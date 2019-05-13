package org.benf.cfr.tests.thirdparty.sable;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 31/05/2013
 * Time: 18:12
 */

public class Main {

    public static void f(short i) {
        Circle c; Rectangle r; Drawable d;
        boolean is_fat;

        if (i > 10) {                   // 6
            r = new Rectangle(i, i);    // 7
            is_fat = r.isFat();         // 8
            d = r;                      // 9
        }
        else {
            c = new Circle(i);          // 12
            is_fat = c.isFat();         // 13
            d = c;                      // 14
        }
        if (!is_fat) d.draw();          // 16
    }                                   // 17

    public static void main(String args[])
    { f((short) 11); }
}