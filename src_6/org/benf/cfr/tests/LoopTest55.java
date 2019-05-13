package org.benf.cfr.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 26/03/2014
 * Time: 16:36
 */
public class LoopTest55 {
    public void test(Map<Object, String> m) {
        List<String> lst = new ArrayList<String>();
        for (Map.Entry<Object, String> e : m.entrySet()) {
            lst.add(e.getValue());
        }
    }
}
