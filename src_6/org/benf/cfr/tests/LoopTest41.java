package org.benf.cfr.tests;

import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 07/06/2011
 * Time: 06:24
 * To change this template use File | Settings | File Templates.
 */
public class LoopTest41 {

    public <E> void test(Collection<E> coll ) {
        for (E c : coll) {
            System.out.println(c);
        }
        for (E d : coll) {
            System.out.println(d);
        }
    }
}
