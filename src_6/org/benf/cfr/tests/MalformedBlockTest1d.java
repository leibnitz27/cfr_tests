package org.benf.cfr.tests;

class MalformedBlockTest1d {
    void useInt(int i) { }
    void useBoolean(boolean b) { }

    void testBoolean(int j) {
        {
            int i = j + 123;
            useInt(i);
        }
        {
            boolean i = true;
            useBoolean(i);
        }
    }
}