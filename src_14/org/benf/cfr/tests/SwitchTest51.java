package org.benf.cfr.tests;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SwitchTest51 {
    public static int[] foo(final String x, final String y, final String z) {
        return new int[]{
            switch (x) {
                case "0" -> 0;
                case "1" -> 1;
                case "2" -> 2;
                default -> -1;
            },
            switch (y) {
                case "0" -> 0;
                case "1" -> 1;
                case "2" -> 2;
                default -> -1;
            },
            switch (z) {
                case "0" -> 0;
                case "1" -> 1;
                case "2" -> 2;
                default -> -1;
            }
        };
    }

    public static void main(String[] args) {
        System.out.println(IntStream.of(foo("2", "1", "3"))
                                    .boxed()
                                    .collect(Collectors.toList()));
    }
}
