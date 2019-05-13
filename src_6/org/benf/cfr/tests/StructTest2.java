package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 13/03/2014
 * Time: 06:53
 */
public class StructTest2 {
    public StructTest1 x;

    void a() {
        this.x = new StructTest1();
        this.x.a = "TesT";
        this.x.b = 4;
    }
}
