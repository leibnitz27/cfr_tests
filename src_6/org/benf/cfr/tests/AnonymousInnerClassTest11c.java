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
public class AnonymousInnerClassTest11c {
    int z = 1;
    public Object test() {
        Object t = new UnaryFunction<Integer, Integer>() {

            @Override
            public Integer invoke(Integer arg) {
                return arg * AnonymousInnerClassTest11c.this.z;
            }
        };
        return t;
    }
}
