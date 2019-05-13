package org.benf.cfr.tests;


import org.benf.cfr.tests.support.ListFactory;
import org.benf.cfr.tests.support.UnaryFunction;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 11/04/2013
 * Time: 17:49
 */
public class AnonymousInnerClassTest16 {

    public static void test(List<List<Integer>> lst2) {
        final List<UnaryFunction<?, Boolean>> res = ListFactory.newList();
        for (final List<Integer> lst : lst2) {
            res.add(new UnaryFunction<List<Integer>, Boolean>() {
                @Override
                public Boolean invoke(List<Integer> arg) {
                    return arg.equals(lst);
                }
            });
        }
    }
}
