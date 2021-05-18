package org.benf.cfr.tests;

public class AggressiveCollapseTest2 {
        int []a;

        void test3a() {
            a[a[0]++] |= 0xFF;
        }
}
