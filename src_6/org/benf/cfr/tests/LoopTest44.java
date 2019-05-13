package org.benf.cfr.tests;

import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 07/06/2011
 * Time: 06:24
 * To change this template use File | Settings | File Templates.
 */
public class LoopTest44 {

    public <E> E test(Collection<E> coll ) {
        for (E c : coll) {
            System.out.println(c);
        }
        for (E c : coll) {
            System.out.println(c);
        }
        return null;
    }
}
