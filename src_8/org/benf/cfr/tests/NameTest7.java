package org.benf.cfr.tests;

import java.io.Serializable;
import java.lang.invoke.SerializedLambda;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class NameTest7 {

    public void foo(int i) {
        Object a;
        {
            a = 3;
            System.out.println(a);
        }
        {
            if (i == 3) a = "Hello";
            System.out.println(a);
        }
        System.out.println(a);
    }
}
