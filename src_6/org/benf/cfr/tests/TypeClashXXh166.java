package org.benf.cfr.tests;

import java.util.ArrayList;
import java.util.LinkedList;

// ArrayList vs LinkedList - common is AbstractList / List / AbstractCollection / Collection / Serializable
class TypeClashXXh166 {
    public Object foo(boolean flag) {
        ArrayList a = new ArrayList();
        LinkedList b = new LinkedList();
        final Object o = flag ? a : b;
        return o;
    }
}
