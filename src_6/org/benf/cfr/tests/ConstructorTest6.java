package org.benf.cfr.tests;

import java.util.HashMap;
import java.util.Map;

public class ConstructorTest6 {

    private final Map<String, String> fred = new HashMap();


    public ConstructorTest6() {
        System.out.println("Jim");
    }

    public ConstructorTest6(int x) {
        System.out.println("fred");
    }
}
