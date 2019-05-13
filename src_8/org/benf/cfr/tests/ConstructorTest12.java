package org.benf.cfr.tests;

import java.util.ArrayList;
import java.util.List;

public class ConstructorTest12 {
    private final List<Integer> stuff = new ArrayList<>();

    {
        stuff.add(1);
        stuff.add(2);
    }
}
