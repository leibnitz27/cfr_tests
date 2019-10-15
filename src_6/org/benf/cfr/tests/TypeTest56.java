package org.benf.cfr.tests;

import java.util.List;

public class TypeTest56 {

    void bar(Object b) {

    }

    void bar(String a) {

    }

    void foo(List<? extends String> a) {
        for (String s : a) {
            bar(s);
            bar((Object)s);
        }
    }

    void bar(List<?> a) {
        for (Object s : a) {
            bar(s);
            bar((Object)s);
        }
    }
}
