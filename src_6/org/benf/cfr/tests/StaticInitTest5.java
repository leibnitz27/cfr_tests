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
public class StaticInitTest5 {

    static int x = 5;
    static final Map<String, String> map;

    /*
     * With an enum, you can't do this!
     */
    static {
        map = new HashMap<String, String>(x);
    }
}
