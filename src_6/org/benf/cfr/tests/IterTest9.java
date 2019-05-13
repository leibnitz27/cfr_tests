package org.benf.cfr.tests;

public class IterTest9 {

    void foo(Iterable<String> i) {
        for (String s : i) {
            System.out.println(s);
        }
    }
}
