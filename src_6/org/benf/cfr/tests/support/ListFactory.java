package org.benf.cfr.tests.support;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 21/05/2013
 * Time: 14:15
 */
public class ListFactory {
    public static <X extends Object> List<X> newList() {
        return new ArrayList<X>();
    }

}
