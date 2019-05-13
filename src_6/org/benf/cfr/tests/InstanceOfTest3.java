package org.benf.cfr.tests;

import java.util.List;

/**
 * User: lee
 * Date: 11/2013
 */
public class InstanceOfTest3 {
    public <T> int test(List<T> l) {
        T tmp = l.get(0);
        if (tmp instanceof String) return ((String) tmp).length();
        return 0;
    }
}
