package org.benf.cfr.tests;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LoopTest72 {
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("one", "two", "three");
        String[] array = new String[list.size()];
        int n = 0;

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext())
        {
            array[n] = iterator.next();
            ++n;
        }
    }
}
