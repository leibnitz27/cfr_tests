package org.benf.cfr.tests;

public record RecordTest13(int test, String myString) {
    public RecordTest13 {
        myString = myString.trim();
    }
}
