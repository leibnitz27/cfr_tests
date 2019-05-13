package org.benf.cfr.tests;

import java.util.ArrayList;
import java.util.List;

public class  Night2 {
    List<? extends String> list = new ArrayList<String>();

    public void main(String[] args) {
        ((List<String>)list).add("hi"); // CFR casts "hi" as (? extends String)
        System.out.println(list.get(0));
    }

}
