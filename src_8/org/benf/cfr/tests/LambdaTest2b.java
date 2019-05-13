package org.benf.cfr.tests;


import org.benf.cfr.tests.support.UnaryFunction;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class LambdaTest2b {

    public Integer test(List<Integer> stuff, int y, boolean b) {
        return stuff.stream().filter(b ? x->x > y : x -> x < 3).findFirst().orElse(null);
    }

}
