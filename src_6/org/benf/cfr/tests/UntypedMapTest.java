package org.benf.cfr.tests;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 25/05/2013
 * Time: 19:13
 */
public class UntypedMapTest {
    private Map memberMap = new TreeMap();

    public void test() {
        Map m = new HashMap();

        m.put("fred", 1);
        m.put(2, "fred");

        memberMap.putAll(m);
    }
}
