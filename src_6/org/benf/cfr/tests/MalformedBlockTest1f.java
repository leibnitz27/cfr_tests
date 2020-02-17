package org.benf.cfr.tests;

class MalformedBlockTest1f {
    void useShort(short s) { System.out.println(s); }
    void useBoolean(boolean b) { System.out.println(b); }

    void testChar() {
        {
            short i = (short) -32767;
            i -= 1;
            useShort(i);
        }
        {
            boolean i = true;
            useBoolean(i);
        }
    }
}