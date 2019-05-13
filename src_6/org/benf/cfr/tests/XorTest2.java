package org.benf.cfr.tests;

public class XorTest2 {
    public static int testXorInline2(int a, int b, int c) {
        a |= c;
        a ^= (b += a);
        return a;
    }

    public static int testXorInline(int a, int b, int c) {
        a ^= (b += (a |= c));
        return a;
    }

    public static void main(String ... args) {
        for (int x=0;x<5;++x) {
            for (int y = 0;y<5;++y) {
                for (int z=0;z<5;++z) {
                    System.out.println("" + x + "," + y + "," + z + ", " + testXorInline(x,y,z) + "|" + testXorInline2(x,y,z));
                }
            }
        }
    }
}
