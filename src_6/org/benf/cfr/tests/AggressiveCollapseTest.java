package org.benf.cfr.tests;

public class AggressiveCollapseTest {
        void test3a(AggressiveCollapseTestCommon a) {
            a.a[0] |= 0xFF;
        }

        void test3b(AggressiveCollapseTestCommon a) {
            a.a[0] = a.a[0] | 0xFF;
        }

        void test3c(AggressiveCollapseTestCommon a) {
            a.a()[0] |= 0xFF;
        }

        void test3d(AggressiveCollapseTestCommon a) {
            // This one is decompiled 100% correctly
            a.a()[0] = a.a()[0] | 0xFF;
        }
}
