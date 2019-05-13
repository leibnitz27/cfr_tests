package org.benf.cfr.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest1 {
    public static <Y extends Integer> void x(List<Y> list) {
        IntStream s = list.stream().filter(x -> {
            System.out.println(x);
            return x.intValue() / 2 == 0;}).map(x -> (Integer)x+2).mapToInt(x -> x);

        s.toArray();
    }

    public static void main(String ... args) {
        x(new ArrayList<Integer>() {{ add(1); add(2); }});
    }
}
