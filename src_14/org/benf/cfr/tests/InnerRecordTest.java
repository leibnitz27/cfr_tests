package org.benf.cfr.tests;

public class InnerRecordTest {

    record RecordTest8 (@MyField String firstName, String lastName) {}

    void test(RecordTest8 foo) {

    }
}
