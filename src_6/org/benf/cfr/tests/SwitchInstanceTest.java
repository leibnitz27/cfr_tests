package org.benf.cfr.tests;

public class SwitchInstanceTest {
    public Singleton getSingleton(int x) {
        switch(x) {
            case 1:
                return Singleton.One.INSTANCE;
            case 2:
                return Singleton.Two.INSTANCE;
        }
        return null;
    }
}
