package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class NameTest9 {

    public String mkString() {
        return "Hello";
    }

    public void foo(int i) {
        Object a=null;

        for (int x=0;x<12 && a==null || a!=null;++x) {
        a = 3;
        System.out.println(a);
            if (x==0) a= mkString();
        }

        a = "Hello";
        System.out.println(a);

    }
}
