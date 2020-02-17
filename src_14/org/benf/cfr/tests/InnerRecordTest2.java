package org.benf.cfr.tests;

public class InnerRecordTest2 {


    void test(int foo) {
        record RecordTestInner2 (@MyField String firstName, String lastName) {}

        RecordTestInner2 x = new RecordTestInner2("fred", "Bloggs");
        System.out.println(x);
    }
}
