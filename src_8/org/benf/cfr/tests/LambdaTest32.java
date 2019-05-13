package org.benf.cfr.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class LambdaTest32 {
    public static void main(String ... args) {
        int x = args.length;
        System.out.println(Arrays.stream(args).map(a -> a + x).collect(Collectors.joining()));
    }
}
