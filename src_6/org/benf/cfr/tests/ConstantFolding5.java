package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 03/04/2012
 */
public class ConstantFolding5 {
    public static void main(String ... args) {
        ConstantFolding5 c = new ConstantFolding5();
        for (int x=0;x<10;++x) {
            c.time1();
            c.time2();
        }
    }

    public void time1() {
        int l = 0;
        long l1 = System.currentTimeMillis();
        for (int x=0;x<10000000;++x) {
            l+=test1(x);
        }
        long l2 = System.currentTimeMillis();
        System.out.println(l + "," + (l2-l1));
    }

    public void time2() {
        int l = 0;
        long l1 = System.currentTimeMillis();
        for (int x=0;x<10000000;++x) {
            l+=test2(x);
        }
        long l2 = System.currentTimeMillis();
        System.out.println(l + "," + (l2-l1));
    }

    public int test1(int a) {
        return a | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1 ;
    }

    public int test2(int a) {
        return a | ( 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1  | 1);
    }
}
