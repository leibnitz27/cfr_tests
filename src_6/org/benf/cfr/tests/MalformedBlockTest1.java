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
        {
            char s = 1;
            useChar(s);
        }
    }

    void testByte() {
        {
            int i = 32767;
            useInt(i);
        }
        {
            byte i = 1;
            useByte(i);
        }
    }

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