package org.benf.cfr.tests;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class NameTest20 {

    public void foo(Object o, String s, Integer i, Number n, IllegalStateException e, int x) {
        Serializable n2 = null;
        if (x==2) n2 = e;
        if (x==3) n2 = i;
        System.out.println(n2);
    }
}
