package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 06:28
 * To change this template use File | Settings | File Templates.
 */
public class AssignTest12b {

    public void test(int j) {
        int i = 1+(j < 3 ? (i=j+ (j<4 ? (i=4) : (i=2))) : (i=1));
        System.out.println(i);
    }
}
