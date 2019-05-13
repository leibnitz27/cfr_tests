package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class StaticInitTest7 extends StaticInitTest5 {

    static int x;

    static {
        int a = System.getProperties().hashCode();
        int b = System.identityHashCode(StaticInitTest7.class);
        if (a < b) {
            x = a;
        } else {
            if (a<b+12) x = a;
            else x = b;
        }
    }
}
