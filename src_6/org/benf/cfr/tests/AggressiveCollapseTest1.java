package org.benf.cfr.tests;

public class AggressiveCollapseTest1 {
        int []a;

        void test3a() {
            a[0] |= 0xFF;
        }

        void test3b() {
            a[0] = a[0] | 0xFF;
        }
}
