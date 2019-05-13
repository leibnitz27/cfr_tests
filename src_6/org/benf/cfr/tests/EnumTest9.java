package org.benf.cfr.tests;

import java.util.Comparator;

enum EnumTest9 implements Comparator<String> {
    ORDINAL {
        @Override
        public int compare(final String s1, final String s2) {
            if (s1 == null) {
                return s2 == null ? 0 : -1;
            }
            if (s2 == null) {
                return 1;
            }
            return s1.compareTo(s2);
        }
    },
    ORDINAL_IGNORE_CASE {
        @Override
        public int compare(final String s1, final String s2) {
            if (s1 == null) {
                return s2 == null ? 0 : -1;
            }
            if (s2 == null) {
                return 1;
            }
            return s1.compareToIgnoreCase(s2);
        }
    }
}