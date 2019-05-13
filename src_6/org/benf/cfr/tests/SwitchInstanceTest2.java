package org.benf.cfr.tests;

public class SwitchInstanceTest2 {
    public Singleton getSingleton(int x) {
        switch(x) {
            case 1:
                return SwitchInstanceTest2_One.INSTANCE;
            case 2:
                return SwitchInstanceTest2_Two.INSTANCE;
        }
        return null;
    }
}
