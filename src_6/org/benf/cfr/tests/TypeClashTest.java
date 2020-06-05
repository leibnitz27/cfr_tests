package org.benf.cfr.tests;

public class TypeClashTest {
    void test() {
        for (int i = 0; i < 10; i++) {
            // CFR incorrectly moves aArr up and reuses it for this string
            String s = "test";
        }

        int[] aArr = new int[1];
        int[] bArr = new int[1];
    }
}
