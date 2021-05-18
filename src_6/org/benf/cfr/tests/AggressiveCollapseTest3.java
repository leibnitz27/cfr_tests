package org.benf.cfr.tests;

public class AggressiveCollapseTest3 {
        void test3a(AggressiveCollapseTestCommon a) {
            a.a[a.a[0]] |= 0xFF;
        }

    void test3e(AggressiveCollapseTestCommon a, int n) {
        a.a[++n] |= 0xFF;
    }
    void test3f(AggressiveCollapseTestCommon a, int n) {
        a.a[++n] = a.a[++n] | 0xFF;
    }

    void test3b(AggressiveCollapseTestCommon a) {
            a.a[a.a[0]] = a.a[a.a[0]] | 0xFF;
        }

        void test3c(AggressiveCollapseTestCommon a) {
            a.a()[a.a[0]] |= 0xFF;
        }

        void test3d(AggressiveCollapseTestCommon a) {
            a.a()[a.a[0]] = a.a()[a.a[0]] | 0xFF;
        }
}
