package org.benf.cfr.tests;


import org.benf.cfr.tests.support.Functional;
import org.benf.cfr.tests.support.Predicate;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * <p/>
 * NB: Gives an interesting example of pointless type generation!!!
 */
public class LoopTestTyped5a {

    static class Container<X> {
        Object contained;
    }

    public static class TypeFilter<X> implements Predicate<Container> {
        private final Class<X> cls;

        TypeFilter(Class<X> cls) {
            this.cls = cls;
        }

        @Override
        public boolean test(Container in) {
            return in.contained.getClass() == cls;
        }
    }

    public static void testList(List<Container> in) {
        List<Container> tries = Functional.filter(in, new TypeFilter<String>(String.class));
    }
}
