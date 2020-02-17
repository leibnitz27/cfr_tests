package org.benf.cfr.tests;

record RecordTest9 (String firstName, String lastName, RecordTest2 child) {
    static int x = 1;

    public RecordTest9 {
        if (firstName == lastName) {
            lastName = "McPointer";
        }
    }

    public RecordTest9(String one) {
        this(one.split(" ")[0], one.split(" ")[1], null);
    }

    public static void doX() {
        x++;
    }

    @Override
    public final int hashCode() {
        return 3;
    }

    @Override
    public String toString() {
        return lastName + "." + firstName;
    }

}
