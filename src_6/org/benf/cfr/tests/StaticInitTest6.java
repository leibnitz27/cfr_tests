package org.benf.cfr.tests;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class StaticInitTest6 extends StaticInitTest5 {

    static int x;

    static {
        int a = System.getProperties().hashCode();
        int b = System.identityHashCode(StaticInitTest6.class);
        if (a < b) {
            x = a;
        } else {
            a+= b;
            if (a<b) x = a;
            else x = b;
        }
    }
}
