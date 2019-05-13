package org.benf.cfr.tests;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class IterTest1a {

    public boolean test2(List<Object> list, Set<Object> set) {
        boolean result = false;
        Iterator<Object> e = list.iterator();
        while (e.hasNext()) {
            if (set.add(e.next())) {
                result = true;
            }
        }
        return result;
    }


}
