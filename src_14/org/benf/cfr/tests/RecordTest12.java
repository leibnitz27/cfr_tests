package org.benf.cfr.tests;
// See https://github.com/leibnitz27/cfr/issues/268
public record RecordTest12<T extends Comparable<T>>(T contained) {
    public record Son<T extends Comparable<T>>(RecordTest12<T> stuff) {

    }
}