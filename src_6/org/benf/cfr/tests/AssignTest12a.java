package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 06:28
 * To change this template use File | Settings | File Templates.
 */
public class AssignTest12a {

    public void test(int j) {
        int i = 1+(j < 3 ? (i=j+ (j<4 ? 4:2)) : (i=1));
    }
}
