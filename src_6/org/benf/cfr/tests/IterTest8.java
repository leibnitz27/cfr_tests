package org.benf.cfr.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterTest8 {

    private static interface VIT extends Iterable<String> {
    }

    void foo(VIT i) {
        for (String s : i) {
            System.out.println(s);
        }
    }
}
