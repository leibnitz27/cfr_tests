package org.benf.cfr.tests;

class MalformedBlockTest1b {
    void useInt(int i) { }
    void useBoolean(boolean b) { }

    void testBoolean() {
        {
            int i = 32767;
            useInt(i);
        }
        {
            boolean i = true;
            useBoolean(i);
        }
    }
}