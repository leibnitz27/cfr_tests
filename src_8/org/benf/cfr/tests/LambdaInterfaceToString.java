package org.benf.cfr.tests;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaInterfaceToString {

    public interface Tagged {
        String tag();
    }

    public String concat(Tagged[] items) {
        return Stream.of(items).map(Tagged::toString).collect(Collectors.joining(","));
    }
}
