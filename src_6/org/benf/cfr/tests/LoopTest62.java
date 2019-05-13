package org.benf.cfr.tests;

public class LoopTest62 {
    // Michael fiddler.
    public static void spreadIntsToBytes( int[] inInts, int inOff, byte[] outBytes, int outOff, int intLen )
    {
        for ( int i = 0; i < intLen; ++i )
        {
            outBytes[outOff + i * 4 + 3] = (byte) ( ( inInts[inOff + i] >>> 24 ) & 0xff );
            outBytes[outOff + i * 4 + 2] = (byte) ( ( inInts[inOff + i] >>> 16 ) & 0xff );
            outBytes[outOff + i * 4 + 1] = (byte) ( ( inInts[inOff + i] >>>  8 ) & 0xff );
            outBytes[outOff + i * 4 + 0] = (byte) ( ( inInts[inOff + i]        ) & 0xff );
        }
    }
}
