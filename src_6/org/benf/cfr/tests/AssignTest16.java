package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 11/02/2013
 * Time: 17:44
 */

import java.util.List;

public class AssignTest16 {

    public int test(int x) {
        int a;
        int b;
        int c = (a=x) + (b=x);
        return a+b+c;
    }

    public int test2(int x) {
        int a = 3;
        int b = x < 5 ? (a=x) : 12;
        return b+a;
    }

    public int test3(int x) {
        int a = 3;
        int b;
        if ((x < 5 ? (a=x) : 12) > 1) { b=1; } else {b=2; System.out.println("HERE");}
        return b+a;
    }
}
