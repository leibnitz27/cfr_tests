package org.benf.cfr.tests.thirdparty.sable;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 31/05/2013
 * Time: 18:11
 */

public class Rectangle implements Drawable {
    public short height, width;
    public Rectangle(short h, short w) {
        height = h; width = w; }
    public boolean isFat() {return (width > height);}
    public void draw() {
        // Code to draw ...
    }
}
