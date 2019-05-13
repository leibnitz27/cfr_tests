package org.benf.cfr.tests;

public class LineNumberTest {
    public void m1() {
        for (int x=0;x<10;++x) {
            System.out.println(x);
        }
    }

    public void m2() {
        int x = 0;
        do {
            System.out.println(x);
            x++;
        } while (x<10);
    }

    public void m3() {
        int x = 0;
        while (x<10) {
            System.out.println(x);
            x++;
        }
    }

}
