package org.benf.cfr.tests;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 12/09/2013
 * Time: 07:37
 */
public class TypeTest33<E> {
    private transient Map<E, Object> map;


    public TypeTest33() {
        this.map = new HashMap<E, Object>();
    }

    public TypeTest33(int x) {
        this.map = new LinkedHashMap<E, Object>();
    }
}
