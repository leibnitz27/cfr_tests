package org.benf.cfr.tests;

class MalformedBlockTest1b2 {
    void useInt(int i) { }
    void useBoolean(boolean b) { }

    void testBoolean() {
        {
            int i = 32767;
            i = i + 1;
            useInt(i);
            i = i + 1;
            i = 0;
            i = 1 ^ i;
            i = 0;
            i = i + 2;
        }
        {
            boolean i = true;
            useBoolean(i);
        }
    }
}