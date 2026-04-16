package org.benf.cfr.tests;

import java.util.HashMap;
import java.util.ArrayList;

// HashMap vs ArrayList - very different hierarchies, common is Serializable + Cloneable
class TypeClashXXh174 {
    public Object foo(boolean flag) {
        HashMap m = new HashMap();
        ArrayList l = new ArrayList();
        final Object o = flag ? m : l;
        return o;
    }
}
