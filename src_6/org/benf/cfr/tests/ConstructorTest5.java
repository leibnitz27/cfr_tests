package org.benf.cfr.tests;

import java.util.HashMap;
import java.util.Map;

public class ConstructorTest5 {

    private final Map<String, String> fred = new HashMap();

    public ConstructorTest5(int x) {
        System.out.println("freD");
    }
}
