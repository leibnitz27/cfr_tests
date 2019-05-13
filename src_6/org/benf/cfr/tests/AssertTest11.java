package org.benf.cfr.tests;

public class AssertTest11 {

    public boolean test() {
        do {
            try {
                assert(false);
            } catch  (AssertionError e) {
                return true;
            }
            if (true) throw new IllegalStateException("Assertions not enabled");
        } while (null != null);
        return false;
    }
}
