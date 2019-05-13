package org.benf.cfr.tests;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CaptureScope {
    public void foo(List<String> args) {
        class Foo {
        }
        Map<String, Foo> map = new HashMap<>();
        for (String arg : args) {
            map.put(arg, new Foo());
        }
    }
}
