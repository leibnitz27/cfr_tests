package org.benf.cfr.tests;

import java.util.Collection;

public class TypeTest37 {
        public static <T> void createServer(Collection<? extends T> coll) throws Exception {
            for (T t : coll) {
                System.out.println(t);
            }

        }

}
