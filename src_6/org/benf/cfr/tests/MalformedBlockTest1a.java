package org.benf.cfr.tests;

class MalformedBlockTest1a {
    void useInt(int i) { }
    void useBoolean(boolean b) { }

    void testBoolean() {
        {
            int i = 32767;
            useInt(i);
        }

        boolean b = true;
        useBoolean(b);
    }
}