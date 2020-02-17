package org.benf.cfr.tests;

record RecordTest3 (String firstName, String lastName, RecordTest2 child) {
    static int x = 1;

    public static void doX() {
        x++;
    }

    public RecordTest3(String one) {
        this(one.split(" ")[0], one.split(" ")[1], null);
        }

}
