package org.benf.cfr.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class LambdaTest31 {
    public static void main(String ... args) {
        ArrayList<String> tmp = new ArrayList<>(Arrays.asList(args));
        Consumer<String> s1 = LambdaTest31::print;
        Consumer<String> s4 = x -> print(x);
    }

    public static void print(String x) {
    }
}
