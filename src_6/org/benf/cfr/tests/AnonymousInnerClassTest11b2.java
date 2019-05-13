package org.benf.cfr.tests;


import org.benf.cfr.tests.support.UnaryFunction;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 11/04/2013
 * Time: 17:49
 */
// This breaks (initially) in J9 due to removal of static markers on anonymous inner classes
// see https://bugs.java.com/bugdatabase/view_bug.do?bug_id=8034044
public class AnonymousInnerClassTest11b2 {
    int z = 1;
    public static Object test(final AnonymousInnerClassTest11b2 x) {
        Object t = new UnaryFunction<Integer, Integer>() {

            @Override
            public Integer invoke(final Integer arg) {
                int y = arg * x.z;
                UnaryFunction<Integer, Integer> t = new UnaryFunction<Integer, Integer>() {

                    @Override
                    public Integer invoke(Integer arg2) {
                        return arg * arg2 * x.z;
                    }
                };
                return t.invoke(y);
            }
        };
        return t;
    }
}
