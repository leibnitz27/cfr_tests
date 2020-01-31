package org.benf.cfr.tests;

class MalformedBlockTest1e {
    static int getInt() { return 323231456; }
    static boolean getBoolean() { return false; }

    static void uses(short s) {}
    static void usei(int i) {}
    static void useb(boolean b) {}

    void testBoolean(int j) {
        // This isn't a problem for 148, as we have IJT available at op02 stage due to known return
        // types.
        {
            boolean i = getBoolean();
            useb(i);
        }
        {
            int i = getInt();
            usei(i);
            uses((short)i);
        }
    }
}