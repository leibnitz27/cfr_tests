package org.benf.cfr.tests;

import java.util.List;

public class BadMoveTest1 {

    private static class Thing {
        public List<Object> getTargets() {
            return null;
        }
    }

    private static void extendCatchBlock(Thing catchStart, List<Object> in) {
        int idx = in.indexOf(catchStart);
        idx++;
        Object next = in.get(idx);
        if (next != catchStart.getTargets().get(0)) return;
        int tot = in.size();
        while (idx < tot && in.get(idx).hashCode() == 12) {
            idx++;
        }
    }
}
