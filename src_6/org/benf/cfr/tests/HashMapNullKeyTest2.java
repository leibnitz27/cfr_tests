package org.benf.cfr.tests;

import java.util.HashMap;
import java.util.Map;

/* HASH MAP SHOULD NOT NPE! */
public class HashMapNullKeyTest2 {

    private static class HashThis {
        private final int hascode;

        public HashThis(int hash) {
            this.hascode = hash;
        }

        @Override
        public int hashCode() {
            return hascode;
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof HashThis)) return false;
            HashThis other = (HashThis)obj;
            return other.hascode == hascode;
        }
    }

    public static void test1() {
        Map<HashThis, Integer> map = new HashMap<HashThis, Integer>();
        map.put(new HashThis(0), null);
        map.put(new HashThis(32), null);
        map.put( null , null);
    }
}
