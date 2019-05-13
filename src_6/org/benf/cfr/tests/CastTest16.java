package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 10/03/2014
 * Time: 11:41
 */
public class CastTest16 {
    public char foo(char c) {
        char x = (char)(c+1);
        return x;
    }

    public short bar(short c) {
        short x = (short)(c>>1);
        return x;
    }

    public byte bap(byte c) {
        byte x = (byte)(c+1);
        return x;
    }
}
