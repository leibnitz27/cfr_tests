package org.benf.cfr.tests;

public class RewriteTests {
    public static int fibonacci(int n) {
        if (n <= (0x67DA ^ 0xFFFFE265 ^ 0x6184 ^ 0xFFFFE43A)) {
            return n;
        }
        return fibonacci(n - (0xBBB ^ 0xFFFFE60B ^ 0x65F2 ^ 0xFFFF8843)) + fibonacci(n - (0x7AD6 ^ 0xFFFFA6F2 ^ 0x66B2 ^ 0xFFFFBA94));
    }
    // ISUB + IADD
    public static int fibonacci2(int n) {
        if (n <= 36 - 40 + 26 - 15 - 6) {
            return n;
        }
        return fibonacci2(n - (208 - 355 + 353 - 245 + 40)) + fibonacci2(n - (223 - 412 + 193 - 2));
    }
    // I2L + LXOR + L2I
    public static int fibonacci3(int n) {
        if (n <= (int)((long)2108268340 ^ (long)2108268341)) {
            return n;
        }
        return fibonacci3(n - (int)((long)864501408 ^ (long)864501409)) + fibonacci3(n - (int)((long)1741113313 ^ (long)1741113315));
    }
}
