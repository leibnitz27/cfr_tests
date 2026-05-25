package org.benf.cfr.tests;

public class LiteralRewriterOverloadTest2 {
    static int iField = 32767;
    static long jField = 2147483647L;

    static int takeInt(int x) { return x; }
    static long takeLong(long x) { return x; }

    static int retInt() { return 32767; }
    static int retIntMin() { return -32768; }
    static long retLong() { return 2147483647L; }
    static long retLongMin() { return -2147483648L; }

    public static void main(String[] args) {
        int a = 32767;
        int b = -32768;
        long la = 2147483647L;
        long lb = -2147483648L;

        int c = a + 32767;
        long lc = la + 2147483647L;

        int[] arr = { 32767, -32768, 0, 32767 };
        long[] larr = { 2147483647L, -2147483648L };

        boolean eq = (a == 32767);
        boolean leq = (la == 2147483647L);

        int t = eq ? 32767 : 0;
        long lt = leq ? 2147483647L : 0L;

        System.out.println(takeInt(32767));
        System.out.println(takeInt(-32768));
        System.out.println(takeLong(2147483647L));
        System.out.println(takeLong(-2147483648L));

        System.out.println(a + " " + b + " " + la + " " + lb + " " + c + " " + lc + " " + arr[0] + " " + larr[0] + " " + eq + " " + leq + " " + t + " " + lt + " " + iField + " " + jField + " " + retInt() + " " + retIntMin() + " " + retLong() + " " + retLongMin());
    }
}
