package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class NameTest12 {

    public int test(int x) {
        return x;
    }

    public int foo(int i) {

        int a = test(i);
        a = test(a);
        a = a+1;
        a = a+1;
        for (int x=0;x<3;++x) {
            for (int y=0;y<12;++y) {
                a = a+1;
                a = a+1;
            }
        }
        a = a+1;
        a = a+1;
        a = test(a);
        a = test(a);

        return a;
    }
}
