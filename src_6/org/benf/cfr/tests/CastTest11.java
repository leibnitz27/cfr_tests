package org.benf.cfr.tests;

public class CastTest11 {
    public String test(final char c) {
        return String.format("'\\u%1$04x'", (int) c);
    }
}
