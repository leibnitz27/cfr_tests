package org.benf.cfr.tests;

class MalformedBlockTest1 {
    void useInt(int i) { }
    void useShort(short s) { }
    void useChar(char c) { }
    void useByte(byte b) { }
    void useBoolean(boolean b) { }

    void testChar() {
        {
            short s = (short) -32767;
            useShort(s);
        }

        char c = 1;
        useChar(c);
    }

    void testByte() {
        {
            int i = 32767;
            useInt(i);
        }

        byte b = 1;
        useByte(b);
    }

    void testBoolean() {
        {
            int i = 32767;
            useInt(i);
        }

        boolean b = true;
        useBoolean(b);
    }
}