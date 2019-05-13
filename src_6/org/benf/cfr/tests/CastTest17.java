package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 10/03/2014
 * Time: 11:41
 */
public class CastTest17 {
    public boolean bap(boolean c) {
        boolean x = (c&c);
        return x;
    }
    public char foo(char c) {
        char x = (char)(c&c);
        return x;
    }

    public short bar(short c) {
        short x = (short)(c&c);
        return x;
    }

    public byte bap(byte c) {
        byte x = (byte)(c&c);
        return x;
    }

}
