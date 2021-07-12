package org.benf.cfr.tests;

record RecordTest11 (String a, String b, String c) {
public RecordTest11(String a, String b, String c) {
        this.a = "hello";
        this.b = this.a + " there";
        this.c = c;
        }
}
