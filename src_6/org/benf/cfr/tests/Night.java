package org.benf.cfr.tests;

import java.util.ArrayList;
import java.util.List;

public class Night {
    // CFR decompiles RHS as "new ArrayList<? extends String>();"
    static List<? extends String> list = new ArrayList<String>();

    public static void main(String[] args) {
        ((List<String>)list).add("hi"); // CFR casts "hi" as (? extends String)
        System.out.println(list.get(0));
    }

}
