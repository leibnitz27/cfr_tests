package org.benf.cfr.tests;

import java.util.Locale;

/**
 * Submitted by chrixian
 */
public class LoopTest47 {
    public int test4(int x) {
        int ret = -1;
        int i = 0;
        for (boolean aFlag = false; i < x; ++i) {
            switch (i) {
                case 0:
                    break;
                case 1:
                    ret = 1;
                    break;
                case 2:
                    ret = 2;
                    aFlag = true;
                default:
                    ret += 0;
                    if (aFlag) {
                        ++ret;
                    }
            }
            if (i == 1) {
                ret = 0;
                break;
            }
            if (ret == x) {
                break;
            }
        }
        if (i < x) {
            return i;
        }
        return ret;
    }
}
