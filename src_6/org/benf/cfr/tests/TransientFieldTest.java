package org.benf.cfr.tests;

import java.io.Serializable;

public class TransientFieldTest implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String name;
    private transient int cachedHash;
    private transient volatile Object cachedHandle;

    public TransientFieldTest(String name) {
        this.name = name;
    }

    public int hash() {
        if (cachedHash == 0) cachedHash = name.hashCode();
        return cachedHash;
    }
}
