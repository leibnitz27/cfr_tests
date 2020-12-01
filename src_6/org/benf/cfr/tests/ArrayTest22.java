package org.benf.cfr.tests;

import java.util.Arrays;
import java.util.List;

public class ArrayTest22 {
    void test() {
        List<String> l = Arrays.asList("foo", "bar", "bap");
        for (String s : l) {
            System.out.println(s);
        }
    }
}
