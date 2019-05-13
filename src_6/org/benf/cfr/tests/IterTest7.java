package org.benf.cfr.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterTest7 {
    private List x = new ArrayList();

    void foo() {
        Iterator<String> i = x.iterator();
        while (i.hasNext()) {
            String s = (String)i.next();
            System.out.println(s);
        }

    }
}
