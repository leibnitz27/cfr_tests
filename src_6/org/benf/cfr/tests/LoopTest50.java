package org.benf.cfr.tests;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 11/03/2014
 * Time: 08:33
 */
public class LoopTest50 {
    public static void foo() {

        Map<Object, Object> m = new HashMap();

        m.put("a", "b");
        m.put(1, 2);

        Set entrySet = m.entrySet();
        Iterator it = entrySet.iterator();

        System.out.println("Prevent for(:) generation");

        while (it.hasNext()) {

            Map.Entry me = (Map.Entry) it.next();

            System.out.println(me.getKey() + "=" + me.getValue());

        }

    }
}
