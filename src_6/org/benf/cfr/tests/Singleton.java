package org.benf.cfr.tests;

public interface Singleton {
    int getInt();

    public class One implements Singleton {
        public static final Singleton INSTANCE = new One();

        @Override
        public int getInt() {
            return 1;
        }
    }

    public class Two implements Singleton {
        public static final Singleton INSTANCE = new Two();

        @Override
        public int getInt() {
            return 2;
        }
    }
}
