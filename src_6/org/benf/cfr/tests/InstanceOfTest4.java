package org.benf.cfr.tests;

import java.util.List;

/**
 * User: lee
 * Date: 11/2013
 */
public abstract class InstanceOfTest4 {

    protected final void getOverloadMethodSet(Object [] args) {
        Integer overloadMethodSet = hashCode();
        if (overloadMethodSet == null) return;
        Object objectType = args[0];
        if (objectType instanceof String) {
            System.out.println("Here");
        }
        System.out.println("test");
    }
}
