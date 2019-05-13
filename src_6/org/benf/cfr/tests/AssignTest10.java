package org.benf.cfr.tests;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 06:28
 * To change this template use File | Settings | File Templates.
 */
public class AssignTest10 {

    public void test(int j) {
        int i = 1+(j < 3 ? (i=j+3) : 32);
    }
}
