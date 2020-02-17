package org.benf.cfr.tests;

record RecordTest6a (String firstName, String lastName, RecordTest2 child) {
    public RecordTest6a(@MyParam String firstName, String lastName, RecordTest2 child) {
        this.firstName = "fred";
        this.lastName = lastName;
        this.child = null;
        }

}
