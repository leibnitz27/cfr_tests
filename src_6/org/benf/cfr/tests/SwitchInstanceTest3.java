package org.benf.cfr.tests;

public class SwitchInstanceTest3 {
    public Singleton getSingleton(int x) {
        switch(x) {
            case 1:
                return One.INSTANCE;
            case 2:
                return Two.INSTANCE;
        }
        return null;
    }

    private static class One implements Singleton {
        private static final Singleton INSTANCE = new One();

        @Override
        public int getInt() {
            return 1;
        }
    }

    private static class Two implements Singleton {
        private static final Singleton INSTANCE = new Two();

        @Override
        public int getInt() {
            return 2;
        }
    }

}
