package org.benf.cfr.tests;

public class LiteralRewriterOverloadTest1 {
    public static String m(int x) { return "int " + x; }
    public static String m(short x) { return "short " + x; }

    public static String n(long x) { return "long " + x; }
    public static String n(int x) { return "int " + x; }

    public static void main(String[] args) {
        System.out.println(m(32767));
        System.out.println(m(-32768));
        System.out.println(n(2147483647L));
        System.out.println(n(-2147483648L));
    }
}
