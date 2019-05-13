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
public class InitTest2 {

    private String[] str;
    final int x = 5;
    final Map<String, String> map = new HashMap<String, String>(x);
    private final int y;

    public InitTest2(int y) {
        str = new String[y+1];
        this.y = y;
    }
}
