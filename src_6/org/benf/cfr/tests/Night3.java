package org.benf.cfr.tests;

import java.util.ArrayList;
import java.util.List;

public class Night3 {

    public void main(String[] args, List<? extends String>  list) {
        ((List<String>)list).add("hi"); // CFR casts "hi" as (? extends String)
        System.out.println(list.get(0));
    }

}
