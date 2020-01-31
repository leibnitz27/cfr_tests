package org.benf.cfr.tests;

class MalformedBlockTest1c {
    void useInt(int i) { }
    void useBoolean(boolean b) { }

    void testBoolean(int j) {
        {
            int i = j;
            useInt(i);
        }
        {
            boolean i = true;
            useBoolean(i);
        }
    }
}