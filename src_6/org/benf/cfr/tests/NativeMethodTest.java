package org.benf.cfr.tests;

public class NativeMethodTest {

    public native int instanceOp(int x);

    public native String greet(String name);

    public static native long staticOp(long a, long b);

    public static native void register();

    protected synchronized native double synchronizedNative(double d);
}
