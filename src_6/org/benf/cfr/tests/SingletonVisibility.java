package org.benf.cfr.tests;

public class SingletonVisibility {
    public Object getSingleton(int x) {
        return One.INSTANCE;
    }

    private static class One {
        private static final Object INSTANCE = new One();
    }
}
