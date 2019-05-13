package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class NameTest13 {

    public int test(int x) {
        return x+1;
    }

    public int foo(int i) {

        int a = test(1);
        a = test(a);
        a = a+1;
        a = a+1;
        a = a+1;
        a = a+1;
        a = test(a) + test(a);
        a = test(a) + test(a);
        a = test(a) + test(a);
        a = test(a) + test(a);
        a = a+1;
        a = a+1;
        a = ++a;
        a = a++;
        a = test(a);
        a = test(a);
        a = a+1;
        i = a;
        return a;
    }
}
