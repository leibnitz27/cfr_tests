package org.benf.cfr.tests;

import java.util.ArrayList;
import java.util.List;

public class Night4 {

    public List<? extends String> main(String[] args) {
        List<? extends String> list = new ArrayList<String>();
        ((List<String>)list).add("hi"); // CFR casts "hi" as (? extends String)
        System.out.println(list.get(0));
        return list;
    }

}
