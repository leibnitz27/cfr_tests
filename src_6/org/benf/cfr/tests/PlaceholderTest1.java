package org.benf.cfr.tests;

import java.util.List;
import java.util.Map;

public class PlaceholderTest1 {
    public static<N extends Number> void addToMap(Map<String, N> tgt, List<N> source)
    {
        // Should not create (Foo item : source)
        for (N item : source)
        {
            tgt.put(item.toString(), item);
        }
    }
}
